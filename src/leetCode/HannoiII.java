package leetCode;

//dynamic programming
//There are m disks and n poles ,the min way to move the disks to the nth poles
public class HannoiII {
    public int move(int m, int[] a) {
        int n = a.length;
        int[][] f = new int[m][n];
        //0,1,2,.....m-1 disks
        //0,1,2,.....n-1 poles
        //initialization
        f[0][0] = 0; //1 disk 1 pole ---0 step
        f[0][1] = 1; //1 disk 2 poles ----1 step
        //f[0][a[j]] ----1 step
        //f[i][0]------0 step
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                f[i][j] = Integer.MAX_VALUE;
                if (i == 0 && j != 0) {
                    f[i][j] = 1;
                } else if (j == 0) {
                    f[i][j] = 0;
                } else if (i >= 1 && j >= 1 && f[i - 1][a[j]] != Integer.MAX_VALUE) {
                    f[i][j] = Math.min(f[i - 1][a[j]] + 1, f[i][j]);
                }
            }
        }
        if (f[m - 1][n - 1] == Integer.MAX_VALUE) {
            f[m - 1][n - 1] = -1;
        }
        return f[m - 1][n - 1];
    }

}
