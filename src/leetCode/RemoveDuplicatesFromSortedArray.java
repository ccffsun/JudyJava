package leetCode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int s = 1;
        int f = 1;
        int previous = nums[0];
        if (nums.length == 1) {
            return 1;
        } else {
            while (f < nums.length) {
                if (nums[f] != previous) {
                    nums[s] = nums[f];
                    previous = nums[f];
                    s++;
                    f++;
                } else {
                    f++;
                }
            }
            return s;
        }
    }
}
