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
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);
        TreeNode treeNode5=new TreeNode(5);
        TreeNode treeNode6=new TreeNode(6);
        treeNode1.left=treeNode2;
        treeNode1.right=treeNode3;
        treeNode2.left=treeNode4;
        treeNode2.right=treeNode5;
        treeNode3.right=treeNode6;
        System.out.println("**********");
        Tree tree=new Tree();
        System.out.println();
        tree.preOrder(treeNode1);
        System.out.println();
        tree.inOrder(treeNode1);
        System.out.println();

        tree.postOrder(treeNode1);
        System.out.println("***********");
        tree.breadthDeepOrder(treeNode1);
    }
}
