class Solution {
    public String reversePrefix(String word, char ch) {
        int p=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                p=i;
                break;
            }
        }
        if(p==-1) return word;
        char[]s=word.toCharArray();
        for(int i=0;i<=(p/2);i++){
            char temp=s[i];
            s[i]=s[p-i];
            s[p-i]=temp;
        }
        return new String(s);
    }
}