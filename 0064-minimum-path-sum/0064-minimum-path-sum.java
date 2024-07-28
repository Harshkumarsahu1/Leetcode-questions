class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        dp=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return helper(n-1,m-1,grid);
    }
    int helper(int i,int j,int mar[][]){
        if(i==0 && j==0){
            return mar[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min=Integer.MAX_VALUE;
        int up=helper(i-1,j,mar);
        int left=helper(i,j-1,mar);
        min=Math.min(up,left);
        return dp[i][j]=min+mar[i][j];
    }
}