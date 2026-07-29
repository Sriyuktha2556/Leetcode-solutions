class Solution {
    public int countPartitions(int[] nums) {
        int[]p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int left=p[i];
            int right=p[nums.length-1]-left;
            if((Math.abs(left-right))%2==0){
                count++;
            }
        }
        return count;
    }
}