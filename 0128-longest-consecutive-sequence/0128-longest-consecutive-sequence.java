class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        int max=0;
        for(int num:h){
            if(!h.contains(num-1)){
                int c=num;
                int length=1;
                while(h.contains(c+1)){
                    length++;
                    c++;
                }
                max=Math.max(max, length);
            }
        }
        return max;
    }
}