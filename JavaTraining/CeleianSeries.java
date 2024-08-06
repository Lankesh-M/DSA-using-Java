package JavaTraining;

class CeleianSeries {
    public static void main(String[] args) {
        int start = 1,N=100;
        // for(int i=0; N>0; i++){
        //     for(int j=0; j<=i; j++,N--){
        //         System.out.print(start+" ");
        //         start+=2;
        //     }
        //     start--;
        // }
        for(int i=start; i <= N; i+=2){
            System.out.print(i+" ");
            if(isPerSq(i)){
                i--;
            }

        }
    }
    public static boolean isPerSq(int n){
        int i = 2;
        // int num = Math.sqrt(n);
        // for(int i=2; i<Math.sqrt())
        int num = (int)Math.sqrt(n);
        return num*num == n;

    }
}
