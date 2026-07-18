class Solution {
    public String sortVowels(String s) {
        char[]a=s.toCharArray();
        List<Character> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(isVowel(a[i])) l.add(a[i]);
        }
        Collections.sort(l);
        int p=0;
        for(int i=0;i<a.length && p<l.size();i++){
            if(isVowel(a[i])){
                a[i]=l.get(p);
                p++;
            }
        }
        return new String(a);
    }
    public static boolean isVowel(char a){
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U') return true;
        return false;
    }
}