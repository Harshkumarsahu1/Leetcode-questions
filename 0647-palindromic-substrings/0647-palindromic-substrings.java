
class Solution{
    int countSubstrings(String S){
        
        int curr =0;
        int n = S.length();
        //Character [] ch = S.split("");
        int left = 0;
        int right = S.length()-1;
        String answer = "";
        int count = 0;
        // while(left<=right){
        //     if(ch[left]==ch[right]){
        //         int size=(right-left)+1;
        //         if(size>cur){
        //             ans=S.subString(left,right+1);
        //         }
        //         left++;
        //         right --;
        //     }
        //     else{
        //         curr=left;
        //         right=n-1;
        //     }
            
            
        // }
            if(n==1){
                return 1;
            }
            
            
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(S.substring(i,j+1))){
                    // if(answer.length()<S.substring(i,j+1).length()){
                    //     //answer = S.substring(i,j+1);
                        
                    // }
                    count ++;
                }
            }
        }
        
        return count;
    }
    
    boolean isPalindrome(String S){
        int left  = 0;
        int right = S.length()-1;
        
        while(left<=right){
            if(S.charAt(left)!=S.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }
