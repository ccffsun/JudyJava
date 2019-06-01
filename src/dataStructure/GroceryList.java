package dataStructure;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    public void GroceryList() {
        ArrayList<String> List1 = new ArrayList<>();
        List1.add("Apple");
        List1.add("Fish");
        List1.add("Toufu");
        List1.add("Potato");
        List1.add("Beef");
        ArrayList<String> List2 = new ArrayList<>();
        List2.add("Pork");
        List2.add("Milk");
        ArrayList<String> List3 = new ArrayList(Arrays.asList("Bread","Sugar","Flour"));
        List1.addAll(List2);
        List1.addAll(List3);
        System.out.println(List1);
        if(List1.contains("Bread")){
            List1.remove("Bread");
        }
        System.out.println(List1);

    }
}
