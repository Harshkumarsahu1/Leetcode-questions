class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        if(coins.length==1){
        if(coins[0]<amount && amount%coins[0]!=0) return -1;
      }
      int n=coins.length;
      dp=new int[n+1][amount+1];
      for(int row[]:dp){
        Arrays.fill(row,-1);
      }
      int result= helper(coins,coins.length,amount); 
      
       return ((result == Integer.MAX_VALUE) ||(result== Integer.MIN_VALUE)) ? -1 : result;
    }
    public int helper(int a[],int n,int sum){
        if(sum==0){
            return 0;
        }
        if(n==0 || sum<0){
            return Integer.MAX_VALUE;
        }
        if(dp[n][sum]!=-1){
            return dp[n][sum];
        }
        int include=Integer.MAX_VALUE;
        if(a[n-1]<=sum){
          int includeResult = helper(a, n, sum - a[n-1]);
            if (includeResult != Integer.MAX_VALUE) {
                include = includeResult + 1;
            }
        }
        int exclude=helper(a,n-1,sum);
        return dp[n][sum]=Math.min(include,exclude);
    }
}