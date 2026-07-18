class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            List<Integer> s=new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                s.add(nums[j]);
            }
            Collections.sort(s);
            int d=s.get(1)-s.get(0);
            boolean found=true;
            for(int j=2;j<s.size();j++){
                if(s.get(j)-s.get(j-1)!=d){
                    found=false;
                    break;
                }
            }
            result.add(found);
        }
        return result;
    }
}