class Solution {
    public boolean canConstruct(String a, String b) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<b.length();i++){
            set.add(b.charAt(i));
        }
        int arr[]=new int[26];
        int brr[]=new int[26];
        for(int i=0;i<a.length();i++){
            arr[a.charAt(i)-'a']++;
        }
         for(int i=0;i<b.length();i++){
            brr[b.charAt(i)-'a']++;
        }
        for(int i=0;i<a.length();i++){
            if(!set.contains(a.charAt(i))) return false;
            else if(set.contains(a.charAt(i)) && arr[a.charAt(i)-'a']>brr[a.charAt(i)-'a']){
                return false;
             }
        }
        return true;
    }
}