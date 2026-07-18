class Solution {
    public int findMin(int[] nums) {
        int p=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            p=Math.min(p,nums[i]);
        }
        return p;
    }
}