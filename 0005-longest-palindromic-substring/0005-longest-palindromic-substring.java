
class Solution{
    // String longestPalindrome(String S){
        
    //     int curr =0;
    //     int n = S.length();
    //     //Character [] ch = S.split("");
    //     int left = 0;
    //     int right = S.length()-1;
    //     String answer = "";
       
    //         if(n==1){
    //             return S;
    //         }
            
            
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             if(isPalindrome(S.substring(i,j+1))){
    //                 if(answer.length()<S.substring(i,j+1).length()){
    //                     answer = S.substring(i,j+1);
    //                 }
    //             }
    //         }
    //     }
        
    //     return answer;
    // }
    
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
    Boolean dp[][];
    
    String longestPalindrome(String S) {
        int n = S.length();
        if (n == 1) {
            return S;
        }
        
        dp = new Boolean[n][n];
        String answer = "";
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (isPalindrome(S, i, j)) {
                    if (len > answer.length()) {
                        answer = S.substring(i, j + 1);
                    }
                }
            }
        }
        
        return answer;
    }
    
    boolean isPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (dp[left][right] != null) {
            return dp[left][right];
        }
        if (s.charAt(left) != s.charAt(right)) {
            return dp[left][right] = false;
        }
        return dp[left][right] = isPalindrome(s, left + 1, right - 1);
    }
    
}