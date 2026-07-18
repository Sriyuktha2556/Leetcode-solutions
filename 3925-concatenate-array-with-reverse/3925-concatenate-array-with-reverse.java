class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[]a=new int[2*n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            a[(2*n)-i-1]=nums[i];
        }
        return a;
    }
}