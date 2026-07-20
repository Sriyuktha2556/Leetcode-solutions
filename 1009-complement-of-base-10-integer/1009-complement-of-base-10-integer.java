class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int x=(1<<digits(n))-1;
        return x^n;
    }
    public int digits(int n){
        int c=0;
        while(n!=0){
            n>>=1;
            c++;
        }
        return c;
    }
}