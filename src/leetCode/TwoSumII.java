package leetCode;

import java.util.HashMap;
/*
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
 */

public class TwoSumII {
    //1. as the twoSum solution use HashMap, index are not zero-based!! Also one solution and not use the same element twice.
    public int[] twoSum (int[] numbers, int target){
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 1;i < numbers.length+1; i++){
            int complement = target - numbers[i-1];
            if (map.containsKey(complement)){
                return new int[]{ map.get(complement),i};
            }
            if(complement >= numbers[i]){
                map.put(numbers[i-1],i);
            }
        }
        throw new IllegalArgumentException("no two sum solution !");
    }
//run time: 1 ms, 54.44%; memory usage: 42.9 MB, 5.22% -- no HashMap

    //2. two pointers- left pointer and right pointer
   public int[] twoSumII (int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            int leftElement = nums[left];
            int rightElement = nums[right];
            if (leftElement + rightElement == target) {
                return new int[] { left+1 , right+1};
            }else if(leftElement + rightElement > target) {
                right--;
            }else {
                left++;
            }
        }
        throw new IllegalArgumentException("no two sum solution! ");
   }
}
