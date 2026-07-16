class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int p=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target){
                    p++;
                }
                int s=j-i+1;
                if(p>(s/2)){
                    c++;
                }
            }
        }
        return c;
    }
}