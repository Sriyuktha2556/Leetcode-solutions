class Solution {
    public String reverseByType(String s) {
        String s1="";
        String s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                s1+=s.charAt(i);
            }
            else{
                s2+=s.charAt(i);
            }
        }
        String result="";
        int p1=s1.length()-1;
        int p2=s2.length()-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                result+=s1.charAt(p1--);
            }
            else{
                result+=s2.charAt(p2--);
            }
        }
        return result;
    }
}