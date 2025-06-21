class Solution {
    public int minimumDeletions(String word, int k) {
        // Count the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Extract frequency values and sort them
        List<Integer> freqs = new ArrayList<>(freqMap.values());
        Collections.sort(freqs);

        int n = freqs.size();
        int minDeletions = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int baseFreq = freqs.get(i);
            int upperBound = baseFreq + k;
            int deletions = 0;

            // Characters with freq < baseFreq → keep as-is
            // Characters with freq > upperBound → delete extra occurrences
            for (int f : freqs) {
                if (f < baseFreq) {
                    deletions += f; // Remove completely
                } else if (f > upperBound) {
                    deletions += (f - upperBound); // Reduce to upperBound
                }
            }
            minDeletions = Math.min(minDeletions, deletions);
        }

        return minDeletions;
    }
}
