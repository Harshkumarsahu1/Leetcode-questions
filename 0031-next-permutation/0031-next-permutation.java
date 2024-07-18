class Solution {
    public void nextPermutation(int[] nums) {

        int idx=-1;
        int n=nums.length;
        for(int i=n-1;i>=1;i--){
         if(nums[i]>nums[i-1]){
            idx=i-1;
            break;
         }
        }
        if(idx==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(nums[i]>nums[idx]){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        int st=idx+1,en=n-1;
        while(st<=en){
            int temp=nums[st];
            nums[st]=nums[en];
            nums[en]=temp;
            st++;en--;
        }
    }
}