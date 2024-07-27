class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
       return helper(text1,text2,text1.length(),text2.length()); 
    }
    public int helper(String st,String bt,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        int include=0;
        int exclude=Integer.MIN_VALUE;
        if(st.charAt(n-1)==bt.charAt(m-1)){
           include=1+helper(st,bt,n-1,m-1);
        }else{
            exclude=Math.max(exclude,Math.max(helper(st,bt,n,m-1),helper(st,bt,n-1,m)));
        }
     return dp[n][m]=Math.max(include,exclude);
    }
}