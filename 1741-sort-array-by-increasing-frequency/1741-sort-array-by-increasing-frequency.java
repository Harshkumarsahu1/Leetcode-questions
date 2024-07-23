class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
       List<Integer> list=new ArrayList<>(map.keySet());
       Collections.sort(list,(a,b)->{
         if(map.get(a)==map.get(b)){
            return b-a;
         }
         else{
            return map.get(a)-map.get(b);
         }
       });
       int ans[]=new int[nums.length];
       int j=0;
        for(int i=0;i<list.size();i++){
            int k=map.get(list.get(i));
            while(k>0){
                ans[j]=list.get(i);
                j++;
                k--;
            }
        }
        return ans;
    }
}