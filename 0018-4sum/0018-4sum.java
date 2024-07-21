class Solution {
    public List<List<Integer>> fourSum(int[] arr, int k) {
         if(arr==null || arr.length<4){
            return new ArrayList<>();
        }
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++){
            //ArrayList<Integer> list=new ArrayList<>();
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int j=i+1;j<arr.length-2;j++){
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int left=j+1;
                int right=arr.length-1;
                while(left<right){
                    long sum=(long)arr[i]+(long)arr[j]+(long)arr[left]+(long)arr[right];
                    if(sum==k){
                        res.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[left],arr[right])));
                        while (left<right && arr[left]==arr[left+1]) left++; // Skip duplicates
                        while (left<right && arr[right]==arr[right-1]) right--;
                        left++;
                        right--;
                    }
                   else if(sum<k){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return res;
        
    }
}