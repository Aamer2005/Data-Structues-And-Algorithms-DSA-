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
    public int diameterOfBinaryTree(TreeNode root) {

        int[] res = new int[1];
       
         diameter(root,res);

         return res[0];
        
    }

    public int diameter(TreeNode root , int[] res)
    {
        if (root==null)
        return 0;

        int left = diameter(root.left,res);
        int right = diameter(root.right,res);

        res[0] = Integer.max(res[0],left+right);

        return Integer.max(left,right)+1;
        
    }
}