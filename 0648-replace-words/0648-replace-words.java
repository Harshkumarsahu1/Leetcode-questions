class Solution {
    Trie root;
    class Trie{
        Trie child[];
        boolean isEnd;
        public Trie(){
            child=new Trie[26];
            isEnd=false;
        }
    }
    public String replaceWords(List<String> d, String s) {
        root=new Trie();
        for(String w:d){
            insert(w);
        }
        StringBuilder result=new StringBuilder();
        String[] input=s.split(" ");
        for(String i:input){
            result.append(search(i));
            result.append(" ");
        }
       return result.toString().trim();
    }
    public String search(String word){
        Trie node=root;
        int j=0;
        for(char c: word.toCharArray()){
            int i=c-'a';
            j++;
            if(node.child[i]==null){
                return word;
            }else if(node.child[i].isEnd){
                return word.substring(0,j);
            }else{
                node=node.child[i];
            }
        }
        return word;
    }
    public void insert(String word){
        Trie node=root;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(node.child[i]==null){
                node.child[i]=new Trie();
            }
            node=node.child[i];
        }
        node.isEnd=true;
    }
}