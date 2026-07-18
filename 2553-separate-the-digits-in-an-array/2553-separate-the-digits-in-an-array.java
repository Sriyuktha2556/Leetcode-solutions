class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=nums.length-1;i>=0;i--){
            int x=nums[i];
            while(x!=0){
                l.add(x%10);
                x/=10;
            }
        }
        int[]a=new int[l.size()];
        int j=l.size()-1;
        for(int i:l){
            a[j--]=i;
        }
        return a;
    }
}