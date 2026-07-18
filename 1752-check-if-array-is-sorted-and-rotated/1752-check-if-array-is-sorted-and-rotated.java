class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int[]a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i];
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            boolean p=true;
            for(int j=0;j<n;j++){
                if(nums[(i+j)%n]!=a[j]){
                    p=false;
                    break;
                }
            }
            if(p) return true;
        }
        return false;
    }
}