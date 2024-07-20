class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int element1=0;
        int element2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2!=nums[i]){
                count1=1;
                element1=nums[i];
            }
             else if(count2==0 && element1!=nums[i]){
                count2=1;
                element2=nums[i];
            }
            else if(element1==nums[i]){
                count1++;
            }
            else if(element2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int check=nums.length/3;
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==element1){
                count1++;
            }
            else if(num==element2){
                count2++;
            }
        }
        if(count1>check){
            list.add(element1);
        }
        if(count2>check){
            list.add(element2);
        }
        return list;
    }
}