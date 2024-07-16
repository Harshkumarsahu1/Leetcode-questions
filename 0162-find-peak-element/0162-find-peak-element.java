class Solution {
    public int findPeakElement(int[] nums) {
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[p]<nums[i]){
                p=i;
            }
        }
        return p;
    }
}