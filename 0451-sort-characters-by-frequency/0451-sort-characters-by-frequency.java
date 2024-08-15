class Solution {
    public String frequencySort(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(!map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),1);
        }else{
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
      }
      PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
      pq.addAll(map.keySet());
      String st="";
      while(!pq.isEmpty()){
         Character c=pq.poll();
         for(int i=0;i<map.get(c);i++){
            st+=c;
         }
      }
      return st;
    }
}