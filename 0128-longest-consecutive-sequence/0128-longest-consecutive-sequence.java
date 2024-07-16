class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
                count++;
                max=Math.max(count,max);
            }
            else if(nums[i]==nums[i-1]){
                continue;
            }
            else{
                count=0;
            }
        }
        if(max==Integer.MIN_VALUE && nums.length==0) return 0;
        else if(max==Integer.MIN_VALUE && nums.length>=1) return 1;
        return max+1;
    }
}