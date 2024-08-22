class Solution {
    public int findComplement(int num) {
        String st=Integer.toBinaryString(num);
        String bt="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='1'){
                bt+='0';
            }else{
                bt+='1';
            }
        }
        int complement=0;
        int p=0;
        for(int i=bt.length()-1;i>=0;i--){
            if(bt.charAt(i)=='1'){
               complement+=(long)(1*Math.pow(2,p));
            }
            p++;
        }
        return complement;
    }
}