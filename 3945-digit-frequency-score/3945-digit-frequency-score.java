class Solution {
    public int digitFrequencyScore(int n) {
        int n1 = n;
        HashMap<Integer, Integer> h = new HashMap<>();
        while(n1!=0){
            int r = n1%10;
            n1 /= 10;
            h.put(r, h.getOrDefault(r,0)+1);
        }
        int c=0;
        for(int i:h.keySet()){
            c += i * h.get(i);
        }
        return c;
    }
}