class Solution {
    public int minOperations(String s) {
        boolean f=false;
        String p1="";
        String p2="";
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                p1+='0';
                p2+='1';
            }
            else{
                p1+='1';
                p2+='0';
            }
        }
        int min=Integer.MAX_VALUE;
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=p1.charAt(i)){
                c1++;
            }
            if(s.charAt(i)!=p2.charAt(i)){
                c2++;
            }
        }
        min=Math.min(c1,c2);
        return min;
    }
}