class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
       int ans[][]=new int[rowSum.length][colSum.length];
       int r[]=new int[rowSum.length];
       int c[]=new int[colSum.length];
       for(int i=0;i<rowSum.length;i++){
        for(int j=0;j<colSum.length;j++){
            int rr=rowSum[i]-r[i];
            int rc=colSum[j]-c[j];
            int val=Math.min(rr,rc);
            ans[i][j]=val;
            r[i]+=val;
            c[j]+=val;
        }
       }
       return ans;
    }
}