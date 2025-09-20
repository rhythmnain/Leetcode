class Router {
    private final Queue<Packet> queue;
    private final int maxMemory;
    private final Map<Integer, Destination> destinations;

    public Router(int memoryLimit) {
        queue = new LinkedList<>();
        maxMemory = memoryLimit;
        destinations = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        // Check for duplicate packet
        Destination dest = destinations.get(destination);
        if (dest != null && dest.contains(timestamp, source)) {
            return false;
        }

        // Evict if memory full
        if (queue.size() == maxMemory) {
            Packet oldest = queue.poll();
            destinations.get(oldest.destination).removePacket();
        }

        // Add to destination tracking
        if (dest == null) {
            dest = new Destination();
            destinations.put(destination, dest);
        }
        dest.addPacket(timestamp, source);

        // Add to main queue
        queue.add(new Packet(source, destination, timestamp));
        return true;
    }

    public int[] forwardPacket() {
        if (queue.isEmpty()) return new int[0];
        
        Packet packet = queue.poll();
        destinations.get(packet.destination).removePacket();
        return new int[]{packet.source, packet.destination, packet.timestamp};
    }

    public int getCount(int destination, int startTime, int endTime) {
        Destination dest = destinations.get(destination);
        return dest == null ? 0 : dest.getCount(startTime, endTime);
    }
}

class Packet {
    int source, destination, timestamp;
    Packet(int s, int d, int t) {
        source = s; destination = d; timestamp = t;
    }
}

class Destination {
    private final List<Packet> packets;
    private final Set<Long> fingerprintSet;
    private int start, end; // Sliding window indices

    Destination() {
        packets = new ArrayList<>();
        fingerprintSet = new HashSet<>();
        start = 0; end = -1;
    }

    public void addPacket(int timestamp, int source) {
        Packet packet = new Packet(source, 0, timestamp);
        packets.add(packet);
        end++;
        fingerprintSet.add(fingerprint(timestamp, source));
    }

    public void removePacket() {
        if (start > end) return;
        Packet packet = packets.get(start);
        fingerprintSet.remove(fingerprint(packet.timestamp, packet.source));
        start++;
    }

    public boolean contains(int timestamp, int source) {
        return fingerprintSet.contains(fingerprint(timestamp, source));
    }

    public int getCount(int startTime, int endTime) {
        if (start > end) return 0;
        
        // Binary search for lower bound
        int left = start, right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (packets.get(mid).timestamp >= startTime) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int lowerBound = left;

        // Binary search for upper bound
        left = start; right = end;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (packets.get(mid).timestamp <= endTime) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int upperBound = right;

        return Math.max(0, upperBound - lowerBound + 1);
    }

    private long fingerprint(int timestamp, int source) {
        return ((long) timestamp << 32) | source;
    }
}