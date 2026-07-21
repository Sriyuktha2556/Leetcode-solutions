class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum=0;
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<0){
                    c++;
                }
                min=Math.min(min,Math.abs(matrix[i][j]));
                sum+=Math.abs(matrix[i][j]);
            }
        }
        if(c%2!=0){
            sum-=2*min;
        }
        return sum;
    }
}