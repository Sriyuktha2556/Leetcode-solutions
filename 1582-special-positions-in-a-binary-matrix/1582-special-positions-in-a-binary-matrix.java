class Solution {
    public int numSpecial(int[][] mat) {
        int s[]=new int[mat.length];
        int p[]=new int[mat[0].length];

        int c1=0;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    s[i]++;
                    p[j]++;
                }
            }
        }
        
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && s[i]==1 && p[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}