package leetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int s = 0;
        int f = 0;
        if (nums.length == 0) {
            return 0;
        } else {
            while (f < nums.length) {

                if (nums[f] != val) {
                    nums[s] = nums[f];
                    s++;
                }
                f++;
            }

        }
        return s;
    }

}
