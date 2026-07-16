class Solution {
    public boolean isPalindrome(String s) {
        int p1=0,p2=s.length()-1;
        while(p1<=p2){
            char a=s.charAt(p1);
            char b=s.charAt(p2);
            if(!isLetter(a) && !isDigit(a)){
                p1++;
                continue;
            }
            if(!isLetter(b) && !isDigit(b)){
                p2--;
                continue;
            }
            if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
    public boolean isLetter(Character p){
        if((p>='a' && p<='z')||(p>='A' && p<='Z')) return true;
        return false;
    }
    public boolean isDigit(int p){
        if(p>='0' && p<='9') return true;
        return false;
    }
}