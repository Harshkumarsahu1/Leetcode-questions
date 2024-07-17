class Solution {
    public void solve(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0 || j==0 || i==board.length-1 || j==board[0].length-1 && board[i][j]=='O'){
                    dfs(board,i,j);

                   // break;
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='T')board[i][j]='O';
                else if(board[i][j]=='O')board[i][j]='X';
            }
        }
     
    }
    void dfs(char board[][],int r,int c){
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c]=='X' ||board[r][c]=='T'){
              return;
        }
        // if(r==0 || c==0 || c==board[0].length-1 || r==board.length-1){
        //     return;
        // }
        board[r][c]='T';
       
        // if((board[r-1][c]=='X' ||board[r+1][c]=='X') && (board[r][c-1]=='X' || board[r][c+1]=='X')){
            
        // }
        //up
        dfs(board,r-1,c);
        //do
        dfs(board,r+1,c);
        //l
        dfs(board,r,c-1);
        dfs(board,r,c+1);
      
       
    }
}