class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0,result=0;
        while(c<s.length && result<g.length){
            if(s[c]>=g[result]){
                result++;
            }
            c++;
        }
        return result;
    }
}