package dataStructure;

import java.util.HashMap;

public class FourSumII {
    public int fourSumCount(int[]a, int[]b, int[]c, int[]d ) {
        HashMap <Integer,Integer> myMap = new HashMap<>();
        for (int element : c) {
            for (int i : d) {
                int sum = element + i;
                if (myMap.containsKey(sum)) {
                    int count = myMap.get(sum);
                    myMap.put(sum, count + 1);
                } else {
                    myMap.put(sum, 1);
                }
            }
        }

        int result = 0;
        for (int item : a) {
            for (int value : b) {
                int sum = item + value;
                if (myMap.containsKey(-1 * sum)) {
                    result += myMap.get(-1 * sum);
                }
            }

        }
        return result;
    }
}
