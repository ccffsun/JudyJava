package leetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            Integer j= map.get(list2[i]);//Integer j
            if (j!=null&&i+j <= min) {
                if (i+j < min) {
                    ans.clear(); //clear the list
                    min = i+j;
                }
                ans.add(list2[i]);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
