class Solution {
    public int lengthOfLastWord(String s) {
        String result="";
        boolean p=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                p=true;
                continue;
            }
            else{
                if(p==true){
                    result="";
                    p=false;
                }
                result+=s.charAt(i);
            }
        }
        return result.length();
    }
}