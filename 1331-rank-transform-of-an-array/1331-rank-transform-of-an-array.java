class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]a=Arrays.copyOf(arr,arr.length);
        Arrays.sort(a);
        HashMap<Integer, Integer> h=new HashMap<>();
        int c=1;
        for(int i=0;i<a.length;i++){
            if(!h.containsKey(a[i])){
                h.put(a[i],c);
                c++;
            }
        }
        for(int i=0;i<arr.length;i++){
            a[i]=h.get(arr[i]);
        }
        return a;
    }
}