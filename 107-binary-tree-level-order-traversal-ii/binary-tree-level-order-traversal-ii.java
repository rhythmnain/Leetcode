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
     static List<List<Integer>>ll;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ll=new ArrayList<>();
        sol(root,0);
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=ll.size()-1;i>=0;i--){
                ans.add(ll.get(i));
            }
        return ans;
        
    }
    public static void sol(TreeNode root,int l){
        if(root==null){
            return;
        }
        if(ll.size()==l){
            ll.add(new ArrayList<>());
        }
        ll.get(l).add(root.val);
        sol(root.left,l+1);
        sol(root.right,l+1);

    }
}