class Solution {
    public int numOfWays(int n) {
        int mod=1000000007;
        long aba=6;   //aba - The first and third tiles are having same color
        long abc=6;   //abc - The colors are different for every tile
        for(int i=1;i<n;i++){
            long next_aba=((3*aba)+(2*abc))%mod; 
    // This considers only cases with next row in aba form but not matching same colors with previous row 
            long next_abc=((2*aba)+(2*abc))%mod;
    // This considers only cases with next row in abc form but not matching same colors with previous row 
            aba=next_aba;
            abc=next_abc;
        }
        return (int)((aba+abc)%mod);
    }
}