class Solution {
    public int appendCharacters(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n==1 && !t.contains(s)) return m;
        if(n==1 && t.contains(s)) return m-1;
        if(m==1 && s.contains(t)) return 0;
        if(m==1 && !s.contains(t)) return 1;
        int i=0;
        int j=0;
        int count=0;
        while(i<n && j<m){
          if(s.charAt(i)==t.charAt(j)) 
          {
            count++;j++;
            }
          i++;
        }
        return m-count;
    }
}