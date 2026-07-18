class Solution {
    public String sortSentence(String s) {
        String[]words=s.split(" ");
        String[]p=new String[words.length];
        for(String w:words){
            int x=w.charAt(w.length()-1)-'1';
            p[x]=w.substring(0,w.length()-1);
        }
        return String.join(" ",p);
    }
}