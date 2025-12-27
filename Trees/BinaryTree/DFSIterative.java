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

    public List<Integer> preorderTraversal(TreeNode root)
    {

        List<Integer> al = new ArrayList<>();

        Stack<TreeNode> s = new Stack<>();

        if(root!=null)
        s.push(root);

        TreeNode x ;

        while(!s.isEmpty())
        {
            x = s.pop();

            if(x.right!=null)
            s.push(x.right);

            if(x.left!=null)
            s.push(x.left);

            al.add(x.val);
        }

        return al;
    }


}