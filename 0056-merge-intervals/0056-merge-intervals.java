class Solution {
    public int[][] merge(int[][] nums) {
        
        List<int []>list=new ArrayList<>();
        Arrays.sort(nums,(a,b)->(a[0]-b[0]));
            list.add(new int[]{nums[0][0],nums[0][1]});
        for(int i=1;i<nums.length;i++){
            int cst=nums[i][0];
            int cen=nums[i][1];
            int pre[]=list.get(list.size()-1);
            int ps=pre[0];
            int pe=pre[1];
            //can
            if(cst<=pe){
                pe=Math.max(pe,cen);
                 list.remove(list.size()-1);
                 list.add(new int[]{ps,pe} );
            }
            else{
                list.add(new int[]{cst,cen});
            }
           
            


        }
        int ans[][]=new int[list.size()][2];
      int i=0;
        for(int[]row:list){
            ans[i++]=row;
        }
        return ans;
    }
}