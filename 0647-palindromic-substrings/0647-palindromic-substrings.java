
class Solution{
    int memo[][];
    int countSubstrings(String S){
        memo=new int[S.length()+1][S.length()+1];
        for(int row[]:memo) Arrays.fill(row,-1);
        int curr =0;
        int n = S.length();
        //Character [] ch = S.split("");
        int left = 0;
        int right = S.length()-1;
        String answer = "";
        int count = 0;
    
            if(n==1){
                return 1;
            }
            
            
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(S,i,j)==1){ 
                    count ++;
                }
            }
        }
        
        return count;
    }
    
    // boolean isPalindrome(String S){
    //     int left  = 0;
    //     int right = S.length()-1;
        
    //     while(left<=right){
    //         if(S.charAt(left)!=S.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
     int isPalindrome(String s, int i, int j) {
        if (i >= j) {
            return 1;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (s.charAt(i) != s.charAt(j)) {
            return memo[i][j] = 0;
        }
        return memo[i][j] = isPalindrome(s, i + 1, j - 1);
    }
    }
