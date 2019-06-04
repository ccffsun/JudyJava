package dataStructure;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapTest {
    public void HashPractise(){
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Mike",1);
        map1.put("Potter",2);
        map1.put("Micky",3);
        int val = map1.get("Potter");
        System.out.println(val);
        map1.replace("Potter",5);
        val = map1.get("Potter");
        System.out.println(val);
        map1.remove("Potter");
        System.out.println(map1);
        boolean bool = map1.containsKey("Potter");
        System.out.println(bool);
        String key="Micky";
        if(map1.containsKey(key)){
            System.out.println(map1.get(key));
        }
        HashMap<Integer, Boolean> isOdd = new HashMap<>();
        for(int i=0;i<10;i++) {
            bool = i % 2 != 0;
            isOdd.put(i, bool);
        }
        System.out.println(isOdd);
        int size = isOdd.size();
        System.out.println(size);

    }
}
