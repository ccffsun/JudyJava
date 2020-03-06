package leetCode;
/*Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

        Your algorithm's runtime complexity must be in the order of O(log n).

        If the target is not found in the array, return [-1, -1].

        Example 1:

        Input: nums = [5,7,7,8,8,10], target = 8
        Output: [3,4]
        Example 2:

        Input: nums = [5,7,7,8,8,10], target = 6
        Output: [-1,-1]*

 */


public class FindTheFirstAndLastPosition {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        //find the start position
        int leftS = left;
        int rightS = right;
        while (leftS < rightS - 1) {
            int midS = leftS + (rightS - leftS) / 2;
            if (nums[midS] >= target) {
                rightS = midS;
            } else {
                leftS = midS;
            }
        }
        if (nums[leftS] == target) {
            result[0] = rightS;
        } else if (nums[rightS] == target) {
            result[0] = leftS;
        } else {
            result[0] = -1;
        }

        int leftE = left;
        int rightE = right;
        while (leftE < rightE - 1) {
            int midE = leftE + (rightE - leftE) / 2;
            if (nums[midE] <= target) {
                leftE = midE;
            } else {
                rightE = midE;
            }
        }
        if (nums[rightE] == target) {
            result[1] = rightE;
        } else if (nums[leftE] == target) {
            result[1] = leftE;
        } else {
            result[1] = -1;
        }

        return result;
    }
}
