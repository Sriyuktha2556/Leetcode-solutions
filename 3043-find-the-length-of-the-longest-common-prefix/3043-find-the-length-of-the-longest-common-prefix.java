class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> h=new HashSet<>();
        for(int i:arr1){
            while(!h.contains(i) && i>0){
                h.add(i);
                i/=10;
            }
        }
        int l=0;
        for(int i:arr2){
            while(!h.contains(i) && i>0){
                i/=10;
            }
            if(i>0){
                l=Math.max(l,(int) Math.log10(i)+1);
            }
        }
        return l;
    }
}