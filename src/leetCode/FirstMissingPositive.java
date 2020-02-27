package leetCode;

import java.util.HashSet;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        //1. array null check  tips: when the array is int[], return 1
        if (nums == null || nums.length == 0) {
            return 1;
        }
        //2.put all the element into the a hash Set
        HashSet<Integer> mySet = new HashSet<>();
        for (int i : nums) {
            mySet.add(i);
        }
        //3.for positive numbers begin with 1, so check positive nums form 1, if the array contains i, i++,
        // if nums !contains(i) , return i;
        int i = 1;
        while (i <= nums.length) {
            if (mySet.contains(i) && i == nums.length) {
                return i+1;
            } else if (mySet.contains(i)){
                i++;
            }else{
                return i;
            }
        }
        return -1;
    }
}
