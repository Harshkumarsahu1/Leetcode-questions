class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i=0;
        int j=arr.length-1;
        int a[]=new int[2];
        while(i<j){
            if(arr[i]+arr[j]==target){
               a[0]=i+1;
               a[1]=j+1;
               return a;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{  
                j--;
            }
        }
        return a;
    }
}