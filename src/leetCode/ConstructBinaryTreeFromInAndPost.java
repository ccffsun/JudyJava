package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConstructBinaryTreeFromInAndPost {

   /* private List<Integer> inOrder;
    private List<Integer> postOrder;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inOrder = new ArrayList<>();
        postOrder = new ArrayList<>();
        for (int i : inorder) {
            inOrder.add(i);
        }
        for (int i : postorder) {
            postOrder.add(i);
        }
        return buildTree(inOrder, postOrder);
    }

    private TreeNode buildTree(List<Integer> inorder, List<Integer> postorder) {
        TreeNode root = null;
        if (inorder == null && postorder == null) {
            return root;
        }

        int m = inorder.size();
        int n = postorder.size();


        if (m != 0 && n != 0 && m == n) {
            int val = postorder.get(n - 1);
            root = new TreeNode(val);
            int rootIndex = inorder.indexOf(val);

            if (n == 1) {
                root.left = null;
                root.right = null;
            }

            if (n == 2) {
                if (inorder.get(0) == postorder.get(0)) {
                    root.left = new TreeNode(inorder.get(0));
                    root.right = null;
                } else {
                    root.left = null;
                    root.right = new TreeNode(inorder.get(1));
                }
            }
            if (n > 2) {
                List<Integer> inLeft = inorder.subList(0, rootIndex);
                List<Integer> inright = inorder.subList(rootIndex + 1, n);
                List<Integer> postleft = postorder.subList(0, rootIndex);
                List<Integer> postright = postorder.subList(rootIndex + 1, n);

                root.left = buildTree(inLeft, postleft);
                root.right = buildTree(inright, postright);
            }
        }
        return  root;
    }

    */

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.length;++i)
            hm.put(inorder[i], i);
        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0,
                postorder.length-1,hm);
    }

    private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe,
                                     HashMap<Integer,Integer> hm){
        if (ps>pe || is>ie) return null;
        TreeNode root = new TreeNode(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hm);
        TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, ps+ri-is, pe-1, hm);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }

}

