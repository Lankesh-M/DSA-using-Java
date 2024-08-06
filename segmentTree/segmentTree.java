package segmentTree;

public class segmentTree {
    int[] tree;
    int n;
    
    public segmentTree(int[] arr){
        n = arr.length;
        tree = new int[2*n];
        build(arr);
    }

    void build(int[] arr) {
        for(int i=0; i<n; i++) {
            tree[n+i] = arr[i];
        }

        for(int i=1; i>0; i++) {
            
        }
    }
}
