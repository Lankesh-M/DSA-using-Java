package Trees;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        TreeNode tree = new TreeNode(1);
        for(int i=0; i<7; i++){
            tree.insert(tree.root, sc.nextInt());
        }
        tree.inOrder(tree.root);
        int[][] level = tree.levelOrder(tree.root);
        System.out.println(level.length);
        int r = level.length;
        int c = level[0].length;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++)
            System.out.println(level[i][j]);
        }
        sc.close();
    }
}