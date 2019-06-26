package leetCode;

//Given an array of n positive integers and a positive integer s, find the minimal length of a
// contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
//
//Example:
//
//Input: s = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: the subarray [4,3] has the minimal length under the problem constraint.


public class MinimunSizeSubArraySum {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        if (nums[0] >= s) return 1;
        int i;
        int a=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(i=0;i<nums.length;i++){
            sum=sum+nums[i];
            while (sum>=s) {
                sum = sum - nums[a];
                a++;
                if(sum<s){
                    minLength=Math.min(minLength,i-a+2);
                }
            }
        }
        if (a== 0 && i == nums.length) return 0;
        else return minLength;
    }

 /*   public int minSubArrayLen2(int s, int[] nums) {
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

  */
}
