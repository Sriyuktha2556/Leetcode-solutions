class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=heights.length;
        HashMap<Integer, String> h=new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[]s=new String[n];
        for(int i=n-1;i>=0;i--){
            s[n-i-1]=h.get(heights[i]);
        }
        return s;
    }
}