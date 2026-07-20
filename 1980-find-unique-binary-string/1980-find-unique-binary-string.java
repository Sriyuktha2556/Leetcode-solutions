class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        String p=generate("",nums.length,hs);
        return p;
    }
    public static String generate(String s, int n, HashSet<String> hs){
        if(s.length()==n){
            if(!hs.contains(s)){
                return s;
            }
            return "";
        }
        String z=generate(s+"0",n,hs);
        if(!z.equals("")) return z;
        String o=generate(s+"1",n,hs);
        if(!o.equals("")) return o;
        return "";
    }
}