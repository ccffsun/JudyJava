package leetCode;

public class SearchA2DMatrixI {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;
        int left = 0;
        int right = totalRow * totalCol - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            int middleElementValue = matrix[mid % totalCol][mid % totalCol];

            if (middleElementValue == target) return true;
            else if (middleElementValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
     return false;
    }

    public boolean searchMartixII(int [][]matrix, int target){
        if(matrix.length==0) return false;
        int col=0;
        int row=matrix.length-1;
        while(col<matrix[0].length && row >=0){
          if(target==matrix[row][col]) {
              return true;
          }else if(target<matrix[row][col]){
              row--;
          }else if(target>matrix[row][col]){
              col++;
          }
        }
        return false;
    }

    public boolean searchMatrixII2(int [][]matrix, int target){
        if(matrix.length==0) return false;
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(target==matrix[row][col]){
                return true;
            }else if(target <matrix[row][col]){
                col--;
            }else if(target>matrix[row][col]){
                row++;
            }
        }
    }
}
