package leetCode;

import java.util.HashMap;
//O(n^2)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                    if (nums[i]==target - nums[j]){
                        return new int [] {i,j};
                    }
                }
            }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] hashTwoSum(int[] nums ,int target) {
        HashMap<Integer,Integer> hashTwoSum =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashTwoSum.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
         int val = target-nums[i];
         if(hashTwoSum.containsKey(val)&& hashTwoSum.get(val)!=i){
             return new int []{i,hashTwoSum.get(val)};
         }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
