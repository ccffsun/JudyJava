package leetCode;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> myMap = new HashMap<>();
        char[] myChar = s.toCharArray();
        for(char n : myChar) {
            if(myMap.containsKey(n)) {
                int count = myMap.get(n);
                myMap.put(n,count+1);
            }else{
                myMap.put(n,1);
            }
        }

        for(int i = 0; i< myChar.length; i++) {
            if(myMap.get(myChar[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
