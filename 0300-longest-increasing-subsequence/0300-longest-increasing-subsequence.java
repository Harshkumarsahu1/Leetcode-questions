class Solution {
    int dp[][];
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        dp=new int[n+1][n+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(n,nums,0,-1);
    }
    int helper(int n,int arr[],int idx,int pre){
        if(idx==n){
            return 0;
        }
        if(dp[idx][pre+1]!=-1){
            return dp[idx][pre+1];
        }
        int notake=helper(n,arr,idx+1,pre);
        int take=0;
        if(pre==-1 ||arr[idx]>arr[pre]){
             take=1+helper(n,arr,idx+1,idx);
        }
        return dp[idx][pre+1]=Math.max(take,notake);
    }
}