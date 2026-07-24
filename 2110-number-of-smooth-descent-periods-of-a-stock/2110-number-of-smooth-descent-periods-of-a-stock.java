class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length;
        long result=1;
        int prev=1;
        for(int i=1;i<n;i++){
            if(prices[i]==prices[i-1]-1){
                ++prev;
            }
            else{
                prev=1;
            }
            result+=prev;
        }
        return result;
    }
}