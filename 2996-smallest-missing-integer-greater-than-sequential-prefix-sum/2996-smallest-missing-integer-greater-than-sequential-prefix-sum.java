class Solution {
    public int missingInteger(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                max+=nums[i];
            }
            else{
                break;
            }
        }
        while(h.containsKey(max)){
            max++;
        }
        return max;
    }
}