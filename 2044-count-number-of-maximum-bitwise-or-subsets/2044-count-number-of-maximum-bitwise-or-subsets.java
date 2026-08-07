class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int o=0;
        for(int i=0;i<nums.length;i++){
            o=o|nums[i];
        }
        int n=nums.length;
        int count=0;
        for(int i=0;i<(1<<n);i++){
            int p=0;
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    p|=nums[j];
                }
            }
            if(p==o){
                count++;
            }
        }
        return count;
    }
}