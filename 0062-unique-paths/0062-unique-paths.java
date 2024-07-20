class Solution {
    int dp[][];
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            dp[i][j]=-1;
        }
       }
      return helper(m-1,n-1);
    }
    public int helper(int i,int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
    
    if(dp[i][j]!=-1){
        return dp[i][j];
    }
    int up=helper(i-1,j);
    int left=helper(i,j-1);
    return dp[i][j]=up+left;
}
}