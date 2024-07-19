class Solution {
    public int maxScore(int[] c, int k) {
        int sum=0;
        int max=0;
        int n=c.length;
        for(int i=0;i<k;i++){
          sum+=c[i];
        }
        max=sum;
        for(int i=0;i<k;i++){
         sum+=c[n-i-1]-c[k-i-1];
         max=Math.max(sum,max);
        }
        return max;
    }
}