class Solution {
    int dp[][];
    public int minInsertions(String s) {
        int n=s.length();
    
        dp=new int[n+1][n+1];
      for(int row[]:dp){
        Arrays.fill(row,-1);
      }
      if(n==1){
        return 0;
      }
      int i=0;
      int j=n-1;
      return n-lps(s,i,j);
    }
    int lps(String s,int i,int j){
        if(i>j){
            return 0;
        }
        if(i==j) return 1;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]=2+lps(s,i+1,j-1);
        }else{
            return dp[i][j]=Math.max(lps(s,i+1,j),lps(s,i,j-1));
        }
    }
}