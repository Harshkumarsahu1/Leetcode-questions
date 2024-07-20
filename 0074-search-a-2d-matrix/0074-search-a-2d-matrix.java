class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int m=matrix[0].length;
        int j=m-1;
        int n=matrix.length;
        while(i>=0 && i<n && j>=0 && j<m){
          if(target==matrix[i][j]){
            return true;
          }
          else if(target<matrix[i][j]){
            j--;
          }else{
            i++;
          }
        }
      return false;
    }
}