class Solution {
    public boolean isPalindrome(int x) {
        String s=""+x;
        int p1=0;
        while(p1<s.length()-1/2){
            if(s.charAt(p1)!=s.charAt(s.length()-p1-1)) return false;
            p1++;
        }
        return true;
    }
}