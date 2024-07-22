class Solution {
    public int lengthOfLongestSubstring(String s) {
     int l=0;
     int max=Integer.MIN_VALUE;
     HashSet<Character> set=new HashSet<>();
     for(int r=0;r<s.length();r++){
       char c=s.charAt(r);
    // set.add(c);
      while(set.contains(c)){
        set.remove(s.charAt(l));
         l++;
        
      }
     set.add(c);
      max=Math.max(max,r-l+1);
     }
     if(max==Integer.MIN_VALUE) return 0;
    return max;
    }
}