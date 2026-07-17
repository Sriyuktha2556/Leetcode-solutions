class Solution {
    public String[] createGrid(int m, int n) {
        char[][]a=new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]='#';
            }
        }
        for(int j=0;j<n;j++){
            a[0][j]='.';
        }
        for(int i=0;i<m;i++){
            a[i][n-1]='.';
        }
        String[]result=new String[m];
        for(int i=0;i<m;i++){
            result[i]=new String(a[i]);
        }
        return result;
    }
}