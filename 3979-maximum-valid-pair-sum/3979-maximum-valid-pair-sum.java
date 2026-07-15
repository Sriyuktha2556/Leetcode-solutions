class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int p=nums[0];
        for(int i=k;i<n;i++){
            p=Math.max(p,nums[i-k]);
            max=Math.max(max,p+nums[i]);
        }
        return max;
    }
}