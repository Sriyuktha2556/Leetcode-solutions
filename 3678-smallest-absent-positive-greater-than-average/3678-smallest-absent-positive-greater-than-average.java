class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            avg+=nums[i];
            hs.add(nums[i]);
        }
        avg/=nums.length;
        boolean found=false;
        int a;
        if(avg<0){
            a=1;
        }
        else{
            a=avg+1;
        }
        while(!found){
            if(hs.contains(a)){
                a++;
            }
            else{
                return a;
            }
        }
        return -1;
    }
}