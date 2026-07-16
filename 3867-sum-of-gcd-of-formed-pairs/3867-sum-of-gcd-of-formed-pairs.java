class Solution {
    public long gcdSum(int[] nums) {
        long[]pre=new long[nums.length];
        long[]max=new long[nums.length];
        max[0]=pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            max[i]=Math.max(nums[i],max[i-1]);
            pre[i]=gcd(nums[i],max[i]);
        }
        Arrays.sort(pre);
        int p1=0,p2=nums.length-1;
        long sum=0;
        while(p1<p2){
            sum+=gcd(pre[p1],pre[p2]);
            p1++;
            p2--;
        }
        return sum;
    }
    public long gcd(long a, long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}