class Solution {
    public long maximumScore(int[] nums) {
        long[]pre=new long[nums.length];
        pre[0]=nums[0];
            for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        long[]suf=new long[nums.length];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=Math.min(nums[i],suf[i+1]);
        }
        long score=Long.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            score=Math.max(score,(pre[i]-suf[i+1]));
        }
        return score;
    }
}