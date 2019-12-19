package leetCode;

public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
      if(matrix.length==0) return false;

      int totalRow=matrix.length;
      int totalCol=matrix[0].length;
      int left=0;
      int right=totalRow*totalCol-1;


      while(left<=right) {
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
}
