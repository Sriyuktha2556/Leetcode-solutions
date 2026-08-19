class Solution {
    public String longestPalindrome(String s) {
        for(int i=s.length();i>0;i--){
            for(int j=0;j<=s.length()-i;j++){
                if(palindrome(j,j+i,s)){
                    return s.substring(j,j+i);
                }
            }
        }
        return "";
    }

    public static boolean palindrome(int i, int j, String t){
        int l=i;
        int r=j-1;
        while(l<r){
            if(t.charAt(l)!=t.charAt(r)) return false;

            l++;
            r--;
        }
        return true;
    }
}