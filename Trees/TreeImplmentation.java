package Trees;
import java.util.Scanner;
class Node{
    int value;
        Node left;
        Node right;

        Node(int val){
            this.value = val;
            this.left = null;
            this.right = null;
        }
}



class TreeNode{
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
    //Traversal - DFS
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

}

public class TreeImplmentation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeNode tree = new TreeNode(1);
        for(int i=0; i<7; i++){
            tree.insert(tree.root, sc.nextInt());
        }
        tree.inorder(tree.root);
        sc.close();
    }
}