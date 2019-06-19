package leetCode;

public class DungeonGame {

    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length; //row
        int n = dungeon[0].length; //column
        int [][]f=new int[m][n];
        if(m==0||n==0){
            return 0;
        }
        int i,j;
        int minHealth=Integer.MAX_VALUE;
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==0&&j==0){
                    f[i][j]=dungeon[i][j];
                }
                else if(i==0){
                    f[i][j]=dungeon[i][j]+f[i][j-1];
                }
                else if(j==0){
                    f[i][j]=dungeon[i][j]+f[i-1][j];
                }
                else {
                    f[i][j]=dungeon[i][j]+Math.max(f[i-1][j],f[i][j-1]);

                }
                minHealth=Math.min(minHealth,f[i][j]);
            }
        }
        return minHealth;
    }
}



