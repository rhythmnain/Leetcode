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
    public TreeNode canMerge(List<TreeNode> trees) {
        HashMap <Integer,TreeNode> map = new HashMap <Integer,TreeNode>();

        for(int i = 0; i < trees.size(); i++)
        {
            if(map.containsKey(trees.get(i).val))
            {
                return null;
            }

            map.put(trees.get(i).val, trees.get(i));
        }

        TreeNode root = trees.get(0);

        for(int i = 0; i < trees.size(); i++)
        {
            if(map.containsKey(trees.get(i).val) && dfs(trees.get(i), map))
            {
                root = trees.get(i);

                map.put(root.val, root);
            }
        }

        if(map.size() == 1 && root != null)
        {
            return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE) == true ? root : null;
        }

        return null;
    }
    

    public boolean check(TreeNode root, int leftMin, int rightMin)
    {
        
        if(root == null)
        {
            return true;
        }

        if(root.val <= leftMin || root.val >= rightMin)
        {
            return false;
        }

        return check(root.left, leftMin, root.val) & check(root.right, root.val, rightMin);
    }

    public boolean dfs(TreeNode node, HashMap <Integer,TreeNode> map)
    {
        boolean flag = false;

        if(node.left != null)
        {
            if(map.containsKey(node.left.val))
            {
                node.left = map.get(node.left.val);
                map.remove(node.left.val);
                flag |= dfs(node.left, map);
                flag |= true;
            }
        }
        
        if(node.right != null)
        {
            if(map.containsKey(node.right.val))
            {
                node.right = map.get(node.right.val);
                map.remove(node.right.val);
                flag |= dfs(node.right, map);
                flag |= true;
            }
            
        }

        return flag;
    }
}