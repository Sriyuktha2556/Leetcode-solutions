class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int x=nums[0]*nums[1]*nums[n-1];
        int y=nums[n-1]*nums[n-2]*nums[n-3];
        if(x<y) return y;
        return x;
    }
}