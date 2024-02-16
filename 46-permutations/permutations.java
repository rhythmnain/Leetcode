class Solution {
    List<List<Integer>> res; List<Integer> permutation; HashSet<Integer> hashset;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>(); permutation = new ArrayList<>();
        hashset = new HashSet<>();
        dfs(nums);
        return res;
    }
    public void dfs(int[] nums){
        if(permutation.size()==nums.length){
            res.add(new ArrayList<>(permutation)); return; }

        for(int j=0; j<nums.length; j++){
            if(hashset.contains(nums[j])) continue;

            permutation.add((Integer)nums[j]); hashset.add((Integer)nums[j]);

            dfs(nums);

            permutation.remove((Integer)nums[j]); hashset.remove((Integer)nums[j]);
            
        }
        return;
    }
}