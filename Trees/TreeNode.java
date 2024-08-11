package Trees;

public class TreeNode{
    Node root;
    public TreeNode(int val){
        this.root = new Node(val);
    }

    public void insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return;
        }
        Node curr = root;
        while(root != null){
            curr = root;
            if(root.value > val)
                root = root.left;
            else
                root = root.right;
        }
        if(val < curr.value)
            curr.left = new Node(val);
        else
            curr.right = new Node(val);
        // root = new Node(val);
        return;
    }
    //Traversal - DFS --> Inorder, Preorder and PostOrder everything is similar
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

}
