class Solution {
    public boolean hasAlternatingBits(int n) {
        int p=n&1;
        n=n>>1;
        for(int i=0;i<32;i++){
            if(n==0) break;
            if(p==(n&1)){
                return false;
            }
            p=n&1;
            n=n>>1;
        }
        return true;
    }
}