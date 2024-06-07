class Solution {
    public int countPrefixes(String[] words, String s) {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.substring(0,i));
        }
        list.add(s);
        int count=0;
        for(int i=0;i<words.length;i++){
            if(list.contains(words[i])) count++;
        }
        return count;
    }
}