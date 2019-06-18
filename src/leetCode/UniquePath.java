package leetCode;
//A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
//
//The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
//
//How many possible unique paths are there?


public class UniquePath {
    public int uniquePaths(int m, int n) {  //m x n grid , return f[m-1][n-1]
        int f[][]= new int [m][n];
        int i,j;
        for(i=0;i<m;i++){  //row: top to down
            for(j=0;j<n;j++){  //column: left to right
                if(i==0||j==0){
                    f[i][j]=1;
                }
                else {
                    f[i][j]=f[i][j-1]+f[i-1][j];
                }
            }
    }
        return f[m-1][n-1];
}
}
