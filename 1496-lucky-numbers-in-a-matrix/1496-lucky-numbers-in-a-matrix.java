class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer> list=new ArrayList<>();
        List<Integer> maxi=new ArrayList<>();
        List<Integer> mini=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
               min=Math.min(min,matrix[i][j]);
            }
            mini.add(min);
        }
        if(matrix.length==1){
            list.add(mini.get(0));
            return list;
        }
        for(int i=0;i<matrix[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
               max=Math.max(max,matrix[j][i]);
            }
            maxi.add(max);
        }
        if(matrix[0].length==1){
            list.add(maxi.get(0));
            return list;
        }
        int n=0;
        if(maxi.size()<mini.size()){
           n=maxi.size();
        }else{
            n=mini.size();
        }
        for(int i=0;i<n;i++){
            if(maxi.contains(mini.get(i))){
                list.add(mini.get(i));
            }
        }
        return list;
    }
}