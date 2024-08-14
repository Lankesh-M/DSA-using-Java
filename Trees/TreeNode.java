package Trees;


import java.util.*;

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
    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    //Traversal - BFS ---> Level Order Traversal
    public int[][] levelOrder(Node root) {
        int[][] res = new int[10][10]; 
        if (root == null) {
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int ind = 0;
        while (!q.isEmpty()) {
            int size = q.size();
             int[] subList = new int[size*2];
            int pos=0;
            for (int i = 0; i < size; i++) {
                Node current = q.poll(); 
                if (current.left != null) {
                    q.offer(current.left);
                }
                if (current.right != null) {
                    q.offer(current.right);
                }
                q.remove();
                subList[pos] = (current.value);
                pos += 1;
            }
            res[ind] = (subList);
            ind += 1;
        }
        return res;
    }

    public List<List<Integer>> level(Node root) {
        List<List<Integer>> res = new List<>(); 
        if (root == null) {
            return res;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> subList = new List<>()
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
                subList.add(current.value);
            }
            res.add(subList);
        }
        return res;
    }

}
