class Solution {
    public boolean wordPattern(String p, String s) {
        String str[]=s.split(" ");
        int n=p.length();
        if(n!=str.length) return false;
        Map<String,Character> wtoc =new HashMap<>();
        Map<Character,String> ctow=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=p.charAt(i);
            String w=str[i];
            if(ctow.containsKey(c)){
                if(!ctow.get(c).equals(w)){
                    return false;
                }
            }
            else{
                if(wtoc.containsKey(w)){
                    return false;
                }
            }
            wtoc.put(w,c);
            ctow.put(c,w);
        }
        return true;
    }
}