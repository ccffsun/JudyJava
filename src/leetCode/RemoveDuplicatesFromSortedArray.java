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

    public int removeDuplicatesII(int[] nums) {
        int s=1;
        int prev=nums[0];
        for(int f=1;f<nums.length;f++){
            if(nums[f]!=prev){
                nums[s]=nums[f];
                prev=nums[f];
                s++;
            }
        }
        return s;
    }
}
