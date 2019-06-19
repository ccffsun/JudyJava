package leetCode;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length; //row
        int n = grid[0].length; //column
        int [][]f=new int[m][n];
        if(m==0||n==0){
            return 0;
        }
        int i,j;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==0&&j==0){
                    f[i][j]=grid[i][j];
                }
                else if(i==0){
                    f[i][j]=grid[i][j]+f[i][j-1];
                }
                else if(j==0){
                    f[i][j]=grid[i][j]+f[i-1][j];
                }
                else {
                    f[i][j]=grid[i][j]+Math.min(f[i-1][j],f[i][j-1]);
                }
            }
        }
        return f[m-1][n-1];
    }
}
