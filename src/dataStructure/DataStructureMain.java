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
        NullTest nt=new NullTest();
        nt.size();

        //BFS
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);

        //dfs

        Graph2 h = new Graph2(4);
        h.addEdge(0, 1);
        h.addEdge(0, 2);
        h.addEdge(1, 2);
        h.addEdge(2, 0);
        h.addEdge(2, 3);
        h.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        h.DFS(2);

        System.out.println("************");
        BinaryTreeBFS bfs =new BinaryTreeBFS();
        bfs.btBFS(treeNode1);
        System.out.println();
        BinaryTreeDFS dfs=new BinaryTreeDFS();
        dfs.btDFS(treeNode1);
        System.out.println();
        dfs.btDFSRECUR(treeNode1);
    }
}


