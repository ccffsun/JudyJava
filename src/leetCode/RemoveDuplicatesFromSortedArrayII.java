package leetCode;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int s = 1;
        if (nums.length == 0) return 0;

        else {
            int prev = nums[0];
            for (int f = 1; f < nums.length; f++) {
                if (nums[f] == prev) {
                    count++;
                    if (count == 2) {
                        nums[s]=nums[f];
                        s++;
                    }
                }
                else if (nums[f] != prev) {
                    count = 1;
                    prev = nums[f];
                    nums[s]=nums[f];
                    s++;
                }
            }
            return s;
        }
    }
}