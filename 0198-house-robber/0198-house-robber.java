class Solution {
    int dp[];
    public int rob(int[] nums) {
        int n=nums.length;
     dp=new int[n+1];
        Arrays.fill(dp,-1);
         return helper(nums,n,0);
    }
    int helper(int arr[],int n,int ind){
        if(ind>=n){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int include=0;
        int exclude=0;
        if(ind<n){
            include=arr[ind]+helper(arr,n,ind+2);
            exclude=helper(arr,n,ind+1);
        }
        else{
            exclude=helper(arr,n,ind+1);
        }
        return dp[ind]=Math.max(include,exclude);
    }
}