package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    //摩尔投票算法是基于这个事实：每次从序列里选择两
    // 个不相同的数字删除掉（或称为“抵消”），最后剩下
    // 一个数字或几个相同的数字，就是出现次数大于总数一半的那个。
    //A Fast Majority Vote Algorithm
    public int majorityElement(int[] nums) {
        int majority=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(count==0){
                majority=nums[i];
                count++;
            }
            else if(majority==nums[i]){
                count++;
            }
            else count--;
        }
        return majority;
    }
    //hashMap
    public int majorityElement2(int[] nums){
        HashMap<Integer,Integer> myMap=new HashMap<>();
        int majority=0;
        for(int num:nums){
            if(!myMap.containsKey(num)){
                myMap.put(num,1);
            }
            else {
                myMap.put(num,myMap.get(num)+1);//key的唯一性，当key重复时，原value被新value覆盖
            }
            if (myMap.get(num)>nums.length/2){
              majority=num;
            }
        }
        return majority;
    }
    //arr.sort
    public int majorityElement3(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}