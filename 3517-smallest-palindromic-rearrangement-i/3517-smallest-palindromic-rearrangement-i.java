class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=s.length()/2;
        char[]a=s.toCharArray();
        Arrays.sort(a,0,mid);
        for(int i=0;i<mid;i++){
            a[n-1-i]=a[i];
        }
        return new String(a);
    }
}