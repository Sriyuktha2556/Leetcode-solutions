class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[]p=new int[n];
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        for(int i=0;i<n;i++){
            if(A[i]==B[i]){
                p[i]+=1;
            }
            if(!h1.contains(A[i])){
                h1.add(A[i]);
            }
            if(!h2.contains(B[i])){
                h2.add(B[i]);
            }
            if(A[i]!=B[i]){
                if(h1.contains(B[i])){
                    p[i]+=1;
                }
                if(h2.contains(A[i])){
                    p[i]+=1;
                }
            } 
            if(i!=0) p[i]+=p[i-1];
        }
        return p;
    }
}