package leetCode;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber (int[] array) {
        //1. array null check . suppose we get -1 when then array is null or array.length is 0.
        if (array == null || array.length == 0) {
            return -1;
        }
        //2.add all the elements into a hash set
        HashSet<Integer> mySet = new HashSet<>();
        for ( int i : array) {
            mySet.add(i);
        }

        //3. analyse different cases. case 1:[0,1] return 2. case 2: mySet contains(i), go on the loop. case 3: mySet(!contains(i)), return i;
        int i = 0;
        while( i < array.length) {
            if(mySet.contains(i) && i == array.length - 1) {
                return i+1 ; // if return i++? why ?
            }else if (mySet.contains(i)) {
                i++;
            }else{
                return i;
            }
        }
      return -1;
    }
}
