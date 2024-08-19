class Solution {
    public int minSteps(int n) {
      if(n==1) return 0;
      int step=0;
      int fact=2;
      while(n>1){
        while(n%fact==0){
            step+=fact;
            n/=fact;
        }
        fact++;
      }
      return step;  
    }
}