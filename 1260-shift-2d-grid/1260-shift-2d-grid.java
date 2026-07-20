class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k%=total;
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            l.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int old=i*n+j;
                int new1=(old+k)%total;
                int newrow=new1/n;
                int newcol=new1%n;
                l.get(newrow).set(newcol, grid[i][j]);
            }
        }
        return l;
    }
}