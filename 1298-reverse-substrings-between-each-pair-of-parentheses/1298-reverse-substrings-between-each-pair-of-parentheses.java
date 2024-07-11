class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(Character c:s.toCharArray()){
            if(c==')'){
                Queue<Character> q=new LinkedList<>();
                while(st.peek()!='('){
                    q.add(st.pop());
                }
                st.pop();
                while(!q.isEmpty()){
                    st.push(q.remove());
                }
            }
            else{
           st.push(c);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}