class DFS{

public static Node createTree()
{
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    return root;
}

public static void preorder(Node node)
{
    if(node==null)
    return;

    System.out.print(node.data);
    preorder(node.left);
    preorder(node.right);
}

public static void inorder(Node node)
{
    if(node == null)
    return;

    inorder(node.left);
    System.out.print(node.data);
    inorder(node.right);
}


public static void postorder(Node node)
{
    if(node == null)
    return;

    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data);

}

public static void main(String[] args)
{
    Node root = createTree();
    preorder(root);
    System.out.println();
    inorder(root);
    System.out.println();
    postorder(root);
}

}