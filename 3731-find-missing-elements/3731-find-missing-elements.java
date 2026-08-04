class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            h.add(nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!h.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}