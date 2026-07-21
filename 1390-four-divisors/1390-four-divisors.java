class Solution {
    public int sumFourDivisors(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) continue; 
            int divisor=0;
            int sum=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    if(j==nums[i]/j){
                        sum+=j;
                        divisor+=1;
                    }
                    else{
                        sum+=j+(nums[i]/j);
                        divisor+=2;
                    }
                }
            }
            if(divisor==4){
                result+=sum;
            }
        }
        return result;
    }
}