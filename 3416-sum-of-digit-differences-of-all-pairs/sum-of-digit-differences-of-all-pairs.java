class Solution {
    public long sumDigitDifferences(int[] nums) {
        int digits = String.valueOf(nums[0]).length();
        long answer=0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=1;j<=digits;j++){
            sum=0;
             map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int d = nums[i]%10;
                if(!map.containsKey(d)){
                    map.put(d,1);
                    answer+= sum;
                }
                else
                {
                    answer+= sum-map.get(d);
                    map.put(d,map.get(d)+1);
                }
                sum++;
                nums[i]=nums[i]/10;
            }
        }
        return answer;
    }
}