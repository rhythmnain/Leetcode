/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        Stack<TreeNode> nodeSt = new Stack();
        Stack<Integer> sumSt = new Stack();

        nodeSt.add(root);
        sumSt.add(targetSum-root.val); 

        while(!nodeSt.isEmpty()){
            TreeNode currNode = nodeSt.pop();
            int currSum = sumSt.pop();

            if(currNode.left == null && currNode.right == null && currSum == 0){
                return true;
            }

            if(currNode.left != null){
                nodeSt.add(currNode.left);
                sumSt.add(currSum-currNode.left.val);
            }

            if(currNode.right != null){
                nodeSt.add(currNode.right);
                sumSt.add(currSum-currNode.right.val);
            }
        }

        return false;
    }
}