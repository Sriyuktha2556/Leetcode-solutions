class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        return count(countAndSay(n-1));
    }
    public static String count(String s){
        String result="";
        int i=0;
        while(i<s.length()){
            int c=0;
            char ch=s.charAt(i);
            while(i<s.length() && s.charAt(i)==ch){
                c++;
                i++;
            }
            result+=c;
            result+=ch;
        }
        return result;
    }
}