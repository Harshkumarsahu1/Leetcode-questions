class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        HashSet<Integer> set=new HashSet<>();
        int c=0;
        for(int i=0;i<nums.length;i++){
            c=target-nums[i];
            if(set.contains(c)){
                ans[1]=i;
                break;
            }
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(c==nums[i]){
                ans[0]=i;
                break;
            }
        }
        return ans;
    }
}