class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        if(max==1||max==2) return max;
        int x=msb(max)+1;
        return (1<<x);
    }
    public static int msb(int n){
        if(n==0) return 0;
        int m=0;
        n=n/2;
        while(n!=0){
            n/=2;
            m++;
        }
        return m;
    }
}