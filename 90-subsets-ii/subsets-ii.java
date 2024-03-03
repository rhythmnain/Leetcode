class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
                List<List<Integer>> res = new ArrayList<>();
                Arrays.sort(nums);
        print(nums,0,new ArrayList<>(),res);

        return res;
    }
    private static void print(int[] arr, int lp, ArrayList<Integer> list, List<List<Integer>> res) {
        if(!res.contains(list))
        res.add(new ArrayList<>(list));

        for (int i = lp; i < arr.length; i++) {
            list.add(arr[i]);
            print(arr, i + 1, list, res);
            list.remove(list.size() - 1);
        }
    }
}