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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> ans = new ArrayList <> ();
        List<Integer> smallans = new ArrayList <> ();
        if(root == null)
            return ans;
        LinkedList<TreeNode>queue=new LinkedList<>();
        queue.addLast (root);
        while(queue.isEmpty()==false)
        {
            int size=queue.size();
            while(size -- > 0)
            {
                TreeNode fnt=queue.removeFirst();
                smallans.add(fnt.val);
                if(fnt.left != null)
                    queue.add(fnt.left);
                if(fnt.right != null)
                    queue.add(fnt.right);
            }
            ans.add(new ArrayList<>(smallans));
            smallans.clear();
        }
        return ans;
    }
}