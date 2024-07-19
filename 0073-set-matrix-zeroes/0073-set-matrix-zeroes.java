class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> listi=new ArrayList<>();
        ArrayList<Integer> listj=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                  listi.add(i);
                  listj.add(j);
                }
            }
        }
        for(int i=0;i<listi.size();i++){
            int x=listi.get(i);
            for(int j=0;j<m;j++){
                matrix[x][j]=0;
            }
        }
        for(int i=0;i<listj.size();i++){
            int x=listj.get(i);
            for(int j=0;j<n;j++){
                matrix[j][x]=0;
            }
        }
        
    }
}