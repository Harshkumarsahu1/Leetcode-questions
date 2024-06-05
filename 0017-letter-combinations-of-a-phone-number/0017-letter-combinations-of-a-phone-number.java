class Solution {
     String phone[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     List<String> result=null;

    public List<String> letterCombinations(String digits) {
        result=new ArrayList<>();
       if(digits.length()==0){
        return result;
       }
       
     dfs(0, digits,new StringBuilder());
     return result;
    }
    public void dfs(int length,String digit,StringBuilder st){
    if(length==digit.length()){
    result.add(st.toString()) ; 
    return;
    }
    char ch=digit.charAt(length);
    String s=phone[ch-'0'];
    for(char k:s.toCharArray()){
        st.append(k);
        dfs(length+1,digit,st);
        st.deleteCharAt(st.length()-1);
    }

    }
}