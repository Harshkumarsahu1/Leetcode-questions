class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        int max=arr[n];
        arr[n]=-1;
        int temp=0;
        for(int i=n-1;i>=0;i--){
            temp=arr[i];
            arr[i]=max;
           if(temp>max){
            max=temp;
           }
        }
        return arr;
    }
}