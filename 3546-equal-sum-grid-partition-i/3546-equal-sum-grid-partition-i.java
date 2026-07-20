class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        long[]horizontal=new long[m];
        long[]vertical=new long[n];
        
        for(int i=0;i<m;i++){
            long sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
            if(i==0){
                horizontal[i]=sum;
            }
            else{
                horizontal[i]=horizontal[i-1]+sum;
            }
        }

        for(int j=0;j<n;j++){
            long sum=0;
            for(int i=0;i<m;i++){
                sum+=grid[i][j];
            }
            if(j==0){
                vertical[j]=sum;
            }
            else{
                vertical[j]=vertical[j-1]+sum;
            }
        }
        
        if(m==1) return checkv(vertical,m,n);
        else if(n==1) return checkh(horizontal,m,n);
        else{
            boolean p=checkh(horizontal,m,n);
            boolean s=checkv(vertical,m,n);
            return p||s;
        }
    }

    public static boolean checkh(long[]horizontal, int m, int n){
        for(int i=0;i<m;i++){
            if(horizontal[i]==horizontal[m-1]-horizontal[i]) return true;
        }
        return false;
    }
    
    public static boolean checkv(long[]vertical, int m, int n){
        for(int j=0;j<n;j++){
            if(vertical[j]==vertical[n-1]-vertical[j]) return true;
        }
        return false;
    }
}