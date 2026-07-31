class Solution {
    public int minimumPushes(String word) {
        int[]a = new int[26];
        for(char c: word.toCharArray()){
            a[c-'a']++;
        }
        Arrays.sort(a);
        int[]b=new int[26];
        for(int i=0;i<26;i++){
            b[i]=a[25-i];
        }
        int t=0;
        for(int i=0;i<26;i++){
            if(b[i]==0) break;
            t+=(i/8+1)*b[i];
        }
        return t;
    }
}