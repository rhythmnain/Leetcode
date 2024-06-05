class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int result = 0;
        
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 2) {
                result ^= entry.getKey();
            }
        }
        
        return result;
    }
}