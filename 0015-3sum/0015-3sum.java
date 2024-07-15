class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
        int j=i+1;
        int k=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum<0){
                j++;
            }
            else if(sum>0){
                k--;
            }
            else{
                List<Integer> ans=new ArrayList<>();
                ans.add(nums[i]);
                ans.add(nums[j]);
                ans.add(nums[k]);
                result.add(ans);
                while(j<k && nums[j]==nums[j+1]){
                   j++;
                }
                 while(j<k && nums[k]==nums[k-1]){
                   k--;
                }
                j++;
                k--;
            }
            }
        }
        return result;
    }
}