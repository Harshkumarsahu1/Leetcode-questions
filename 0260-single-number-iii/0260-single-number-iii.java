class Solution {
    public int[] singleNumber(int[] nums) {
       int result[]=new int[2];
       int xor=0;
       for(int i=0;i<nums.length;i++){
          xor=xor^nums[i];
       }
       int rightmostSetBit=xor & -xor;
     for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }
        
        return result;
    }
}