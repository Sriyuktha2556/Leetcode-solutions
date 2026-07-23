class Solution {
    public int minLength(int[] nums, int k) {
        int p=0,ans=Integer.MAX_VALUE;
        long s=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])==1) s+=nums[i];
            while(s>=k){
                ans=Math.min(ans,i-p+1);
                hm.put(nums[p],hm.get(nums[p])-1);
                if(hm.get(nums[p])==0) s-=nums[p];
                p++;
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}