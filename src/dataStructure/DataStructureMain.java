package dataStructure;

public class DataStructureMain {
    public static void main(String[] args) {
        ArrayListTest a = new ArrayListTest();
        a.Arraypractise();
        GroceryList myList = new GroceryList();
        myList.GroceryList();
        HashMapTest test1 = new HashMapTest();
        test1.HashPractise();
        ListNodeTest lnt = new ListNodeTest();
        lnt.ListNodePractise();
        int[] b = {1, 3, 4, 3, 4, 5, 6, 1};
        Sort st1 = new Sort();
        st1.sort2(b);
        for (int i : b) {
            System.out.print(i);
        }
    }
}
