class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length;
        int[][]pre=new int[n][m];
        pre[0][0]=grid[0][0];
        int count=0;
        if(pre[0][0]<=k) count++;
        for(int i=1;i<m;i++){
            pre[0][i]=pre[0][i-1]+grid[0][i];
            if(pre[0][i]<=k) count++;
        }
        for(int i=1;i<n;i++){
            pre[i][0]=pre[i-1][0]+grid[i][0];
            if(pre[i][0]<=k) count++;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                pre[i][j]=grid[i][j]+pre[i-1][j]+pre[i][j-1]-pre[i-1][j-1];
                if(pre[i][j]<=k) count++;
            }
        }
        return count;
    }
}