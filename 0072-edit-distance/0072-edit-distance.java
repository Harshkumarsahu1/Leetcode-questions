class Solution {
    int dp[][];
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        dp=new int[n+1][m+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
       
        return helper(word1,word2,n,m);
    }
    int helper(String st,String bt,int n,int m){
        if(n==0){
            return m;
        }
        if(m==0){
            return n;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        int include=0;
        if(st.charAt(n-1)==bt.charAt(m-1)){
          dp[n][m]=helper(st,bt,n-1,m-1);
        }else{
            int insert=1 + helper(st, bt, n, m-1);    // Insert character
            int delete=1 + helper(st, bt, n-1, m);    // Delete character
            int replace=1 + helper(st, bt, n-1, m-1); // Replace character
            dp[n][m]=Math.min(insert, Math.min(delete, replace));
         }
        return dp[n][m];
    }
}