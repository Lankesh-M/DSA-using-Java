package Trees;
import java.util.Scanner;





public class Main{
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