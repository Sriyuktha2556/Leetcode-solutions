class Solution {
    public int subarraySum(int[] nums, int k) {
        int[]p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<p.length;i++){
            if(p[i]==k){
                c++;
            }
            for(int j=0;j<i;j++){
                if(p[i]-p[j]==k){
                    c++;
                }
            }
        }
        return c;
    }
}