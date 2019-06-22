package leetCode;

//给定一个正整数s, 判断一个数组arr中，是否有一组数字加起来等于s。
public class TargetSumOfArray {
    public boolean targetSumOfArray(int[] arr, int s) {
        int n = arr.length - 1;
        boolean[][] subset = new boolean[n + 1][s + 1];
        int i, j;

        for (j = 0; j < s + 1; j++) {
            subset[0][j] = false;
        }
            for (i = 0; i < n + 1; i++) {
                subset[i][0] = true;
            }
            subset[0][arr[0]] = true;
            for (i = 1; i < n + 1; i++) {
                for (j = 1; j < s + 1; j++) {
                    if (arr[i] > j)
                        subset[i][j] = subset[i - 1][j];
                    else
                        //  subset[0][j] subset[i][0] j>=arr[i]  arr[0]    j==0
                        subset[i][j] = subset[i - 1][j - arr[i]] || subset[i - 1][j];
                }

            }

        return subset[n][s];
    }
}