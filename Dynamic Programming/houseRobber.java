import java.util.*;
// Link - https://leetcode.com/problems/house-robber/
class houseRobber {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.print(dp[0]);
        return pickNotPick(nums, nums.length - 1, dp);
    }
    public int pickNotPick(int[] nums, int ind, int[] dp){
        if(ind == 0){
            return nums[0];
        }
        if(ind < 0){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int pick = nums[ind] + pickNotPick(nums, ind-2, dp);
        int notPick = 0 + pickNotPick(nums, ind-1, dp);
        dp[ind] = Math.max(pick, notPick);
        return Math.max(pick, notPick);
    }
}