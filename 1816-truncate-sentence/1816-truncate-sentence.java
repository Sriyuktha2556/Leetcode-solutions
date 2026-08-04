class Solution {
    public String truncateSentence(String s, int k) {
        String[]word=s.split(" ");
        String p="";
        for(int i=0;i<k;i++){
            p+=word[i];
            if(i+1==k) break;
            p+=" ";
        }
        return p;
    }
}