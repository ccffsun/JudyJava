package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val);
        }
    }

    public void breadthDeepOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if (root != null) {
            q.add(root);
        }
        while (q.size() != 0) {
            System.out.println(q.peek().val);
            q.poll();

            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
            root = q.peek();
        }
    }
}
