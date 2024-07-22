class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        if(nums.length==1) return 1;
        for(int num:nums){
            set.add(num);
        }
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(set.contains(num)){
              if(!set.contains(num-1)){
                 count=1;
                int curr=num;
                while(set.contains(curr+count)){
                    count++;
                }
                max=Math.max(max,count);
              }
           }
        }
        if(max==Integer.MIN_VALUE) return 0;
         return max;
    }
}