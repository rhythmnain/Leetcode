class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }

    TreeNode bst(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, start, mid - 1);
        node.right = bst(nums, mid + 1, end);
        return node;
    }
}