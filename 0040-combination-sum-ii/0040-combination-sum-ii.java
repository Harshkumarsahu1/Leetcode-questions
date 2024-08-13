class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        sol(0,candidates,target,res, new ArrayList<>());
        return res;
    }
    public void sol(int idx,int c[],int t,List<List<Integer>> res,List<Integer> l){
        if(t<0) return;
        if(t==0){
            res.add(new ArrayList<>(l));
            return;
        }
       for(int i=idx;i<c.length;i++){
        if(i>idx && c[i]==c[i-1]){
            continue;
        }
        l.add(c[i]);
        sol(i+1,c,t-c[i],res,l);
        l.remove(l.size()-1);
       }
    }

}