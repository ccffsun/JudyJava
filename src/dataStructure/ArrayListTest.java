package dataStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;  // Import the Collections class

public class ArrayListTest {
            public void Arraypractise() {
                List<Integer> myNumbers = new ArrayList<Integer>();
                myNumbers.add(3);
                myNumbers.add(5);
                myNumbers.add(9);
                myNumbers.add(79);

                List<String> myString = new ArrayList<String>();
                myString.add("Hello ");
                myString.add("World ");
                myString.add("! ");

                List<Boolean> myBoo = new ArrayList<Boolean>();
                myBoo.add(true);
                myBoo.add(false);
                myBoo.add(false);
                myBoo.add(true);

                System.out.println(myNumbers);
                for (int i:myNumbers){
                    System.out.println(i);
                }

                System.out.println(myString);
                for (String s:myString){
                    System.out.println(s);

                }

                System.out.println(myBoo);
                for (boolean b:myBoo){
                    System.out.println(b);
                }

                int numberGet=myNumbers.get(0);
                String stringGet=myString.get(1);
                boolean booGet=myBoo.get(3);
                System.out.println(numberGet+stringGet+booGet);


            }

}
