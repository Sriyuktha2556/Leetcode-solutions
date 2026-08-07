class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        HashSet<List<Integer>> result=new HashSet<>();
        for(int i=0;i<(1<<n);i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    l.add(nums[j]);
                }
            }
            result.add(l);
        }
        return new ArrayList<>(result);
    }
}