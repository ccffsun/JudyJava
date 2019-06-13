package leetCode;

//Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//Note: You are not suppose to use the library's sort function for this problem.
//
//Example:
//
//Input: [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            System.out.println("WRONG COLOR");
        }
        int h = 0;
        int t = nums.length - 1;
        int i = 0;
        while (h <= i && t >= i) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[h];
                nums[h] = temp;
                h++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[t];
                nums[t] = temp;
                t--;
            }
        }
    }
}
