class Solution {
    public int longestConsecutive(int[] nums) {
         int maxSeq = 0;
        Set<Integer> sequences = new HashSet();
        for (int num : nums) {
            sequences.add(num);
        }
        for (int num : nums) {
            int nextInSeq = num + 1;
            int prevInSeq = num - 1;
            int currentSequence = 1;
            while (sequences.remove(prevInSeq--)) {
                currentSequence++;
            }
            while (sequences.remove(nextInSeq++)) {
                currentSequence++;
            }
            if (currentSequence > maxSeq) {
                maxSeq = currentSequence;
            }
        }
        return maxSeq;
    }
}