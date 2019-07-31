package dataStructure;

import java.util.HashSet;
import java.util.Set;

public class MyHashSet {
    public void hashSet() {
        Set<Integer> myHashSet = new HashSet<Integer>();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(14);
        myHashSet.add(15);
        myHashSet.add(3);
        myHashSet.add(7);
        myHashSet.add(2);
        myHashSet.add(10);
        myHashSet.add(-1);
        for(int i:myHashSet){
            System.out.println(i);
        }
    }
}
