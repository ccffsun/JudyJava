package leetCode;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        int i;
        int max = Integer.MIN_VALUE;
        int maj = nums[0];
        int[] count = new int[nums.length];
        for (i = 0; i < nums.length; i++) {
            count[nums[i]]++;
            max = Math.max(max, count[nums[i]]);
            if (count[nums[i]] > max) {
                maj = nums[i];
            }

        }
        return maj;
    }
}
