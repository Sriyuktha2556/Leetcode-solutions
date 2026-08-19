class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][]dp=new boolean[n][n];
        int[]ans=new int[]{0,0};
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                ans[0]=i;
                ans[1]=i+1;
            }
        }
        for(int i=2;i<n;i++){
            for(int j=0;j<n-i;j++){
                int k=i+j;
                if(s.charAt(j)==s.charAt(k) && dp[j+1][k-1]){
                    dp[j][k]=true;
                    ans[0]=j;
                    ans[1]=k;
                }
            }
        }
        int p1=ans[0];
        int p2=ans[1];
        return s.substring(p1,p2+1);
    }
}