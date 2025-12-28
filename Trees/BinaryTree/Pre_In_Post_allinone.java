/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    List<List<Integer>> treeTraversal(TreeNode root) {

        Stack<Pair> st = new Stack<Pair>();

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        st.push(new Pair(root,1));

        if(root==null)return;

        while(!st.isEmpty())
        {

            Pair it =st.pop();

            if(it.num==1)
            {
                pre.add(it.node.val);
                it.num++;
                st.push(it);

                if(it.node.left!=null)
                {
                    st.push(new Pair(it.node.left,1));
                }

            }
            else if(it.num==2)
            {
                in.add(it.node.val);
                it.num++;
                st.push(it);

                if(it.node.right!=null)
                {
                    st.push(new Pair(it.node.right,1));
                }
            }
            else{
                post.add(it.node.val);

            }
        }

        List<List<Integer>> al = new ArrayList<>();

        al.add(pre);
        al.add(in);
        al.add(post);

        return al;

    }
}