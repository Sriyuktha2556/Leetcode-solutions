class Solution {
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        for(int i=1;i<n;i++){
            if(complexity[i]<=complexity[0]){
                return 0;
            }
        }
        long fact=1;
        int mod=1000000007;
        for(int i=2;i<n;i++){
            fact=(fact*i)%mod;
        }
        return (int)fact;
    }
}