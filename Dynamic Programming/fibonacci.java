public class fibonacci{
    public static void main(String args[]){
        System.out.println("Using Recursive Method " + fibRecur(7)); // 0 1 1 2 3 5 8 13
        System.out.println("Using Tabulation(DP) Method " + fibDP(7)); // 0 1 1 2 3 5 8 13
    }
    public static int fibRecur(int num){
        //Tc : O()
        if(num < 2){
            return num; 
        }
        return fibRecur(num - 1) + fibRecur(num - 2);
    }

    public static int fibDP(int num) {
        //TC : O(N) and SC : O(N)
        int[] dp = new int[num + 1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<num+1; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[num];
    }
}

