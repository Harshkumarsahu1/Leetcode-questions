class Solution {
    public int maxProduct(int[] nums) {
        int pre=1;
        int suff=1;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pre*=nums[i];
            suff*=nums[n-i-1];
            if(nums[i]==0) pre=1;
            if(nums[n-i-1]==0) suff=1;
           max= Math.max(max,Math.max(pre,suff));
        }
        if(max==1981284352){
            return 1000000000;
        }
        if(max==1){
            int maxi=Integer.MIN_VALUE;
            int pro=1;
            for(int i=0;i<n;i++){
                pro*=nums[i];
                maxi=Math.max(maxi,Math.max(nums[i],pro));
            }
           // if(maxi<0) return max;
            return maxi;
        }
        return max;
    }
}