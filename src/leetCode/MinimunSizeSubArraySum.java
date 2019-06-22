package leetCode;

public class MinimunSizeSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        if (nums[0] >= s) return 1;

        int si, sj, i, j, l, min;
        si = l = 0;
        j = -1;
        sj = 0;
        int sum = 0;
        min = Integer.MAX_VALUE;


        for (i = -1; i < nums.length - 1; i++) {
            if (i >= 0) {
                si = si + nums[i];
            }
            while (j < nums.length - 1 && j >= i) {
                if (sum < s) {
                    j++;
                    sj = sj + nums[j];
                    sum = sj - si;
                } else
                    break;
            }
            l = j - i + 1;
            min = Math.min(l, min);
            if (i >= 0) {
                sum = sum - nums[i];
            }

        }
        if (i == 0 && j == nums.length) return 0;
        else return min;
    }

    public int minSubArrayLen2(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = 0;
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        while (right <= nums.length) {
            if (sum < s) {
                if(right==nums.length)
                    break;
                sum += nums[right];
                right++;
            } else {
                while (sum >= s) {
                    minLength = Math.min(minLength, right - left);
                    sum -= nums[left];
                    left++;
                }
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
