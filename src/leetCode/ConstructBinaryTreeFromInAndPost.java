package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstructBinaryTreeFromInAndPost {

    private List<Integer> inOrder;
    private List<Integer> postOrder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrder= new ArrayList<>();
        postOrder=new ArrayList<>();
        for (int i : inorder) {
            inOrder.add(i);
        }
        for(int i:postorder){
            postOrder.add(i);
        }
       return buildTree(inOrder,postOrder);
    }

    private TreeNode buildTree(List<Integer> inorder, List<Integer> postorder){
        int m=inorder.size();
        int n=postorder.size();

        if(m!=n||m==0) return null;

        int val=postorder.get(n-1);
        TreeNode root= new TreeNode(val);
        int rootIndex=inorder.indexOf(val);

        List<Integer> inLeft=inorder.subList(0,rootIndex);
        List<Integer> inright=inorder.subList(rootIndex+1,n);
        List<Integer> postleft=postorder.subList(0,rootIndex);
        List<Integer> postright=postorder.subList(rootIndex+1,n);

        root.left=buildTree(inLeft,postleft);
        root.right=buildTree(inright,postright);

        return root;
    }
}
