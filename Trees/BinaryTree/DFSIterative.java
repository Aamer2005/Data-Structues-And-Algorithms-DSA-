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

class Solution1 {

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


class Solution2 {
//PostOrder Using 2 Stack
    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        if(root!=null)
        s1.push(root);

        TreeNode node ;

        while(!s1.isEmpty())
        {
            node = s1.peek();

            s2.push(s1.pop());

            if(node.left!=null)
            s1.push(node.left);

            if(node.right!=null)
            s1.push(node.right);
        }

        List<Integer> al = new ArrayList<>();
        while(!s2.isEmpty())
        {
            al.add(s2.pop().val);
        }

        return al;
    }
}