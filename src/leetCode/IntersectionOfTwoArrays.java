package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
    public int[] intersect (int[] a, int[] b) {
        HashMap <Integer,Integer> myMap = new HashMap<>();
        for(int n : a) {
            if(myMap.containsKey(n)) {
                int count = myMap.get(n);
                myMap.put(n, count + 1);
            }else {
                myMap.put(n,1);
            }
        }

        List<Integer> myList = new ArrayList<>();
        for(int n : b) {
            if(myMap.containsKey(n)) {
               int count = myMap.get(n);
               if(count > 0) {  // check the count
                   myList.add(n);
                   myMap.put(n, count - 1);
               }
            }
        }
        int[] result =  new int[myList.size()];
        for(int i=0; i< myList.size();i++){
            result[i] = myList.get(i);
        }
        return result;
    }
}
