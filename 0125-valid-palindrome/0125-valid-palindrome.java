class Solution {
   public static boolean isPalindrome(String s) {
    int n=s.length();
    s=s.toLowerCase();
     s = s.toLowerCase();
        s = s.replace(",", "");
        s = s.replace(" ", "");
        s = s.replace(":", "");
        s = s.replace(";", "");
        s = s.replace(".", "");
        s = s.replace("@", "");
        s = s.replace("#", "");
        s = s.replace("$", "");
        s = s.replace("%", "");
        s = s.replace("^", "");
        s = s.replace("&", "");
        s = s.replace("*", "");
        s = s.replace("_", "");
        s = s.replace("(", "");
        s = s.replace(")", "");
        s = s.replace("[", "");
        s = s.replace("]", "");
        s = s.replace("{", "");
        s = s.replace("}", "");
        s = s.replace("\\", "");
        s = s.replace("|", "");
        s = s.replace("<", "");
        s = s.replace(">", "");
        s = s.replace("?", "");
        s = s.replace("/", "");
        s = s.replace("'", "");
        s = s.replace("\"", ""); 
        s=s.replace("!","");
        s=s.replace("`","");
        s=s.replace("-","");
    StringBuilder st=new StringBuilder();
    for(int i=s.length()-1;i>=0;i--){
        st.append(s.charAt(i));
    }
    String result=st.toString();
  
   return s.equals(result);
}
}
