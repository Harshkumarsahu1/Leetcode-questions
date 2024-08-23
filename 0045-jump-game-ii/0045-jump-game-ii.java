class Solution {
    public int jump(int[] nums) {
        int curr=0;
        int dest=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        if(nums.length<=1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            dest=Math.max(dest,i+nums[i]);
            if(curr==i){
                count++;
                curr=dest;
                if(curr>=nums.length-1){
                    break;
                }
            }
        }
        return count;
    }
}