package leetCode;

import dataStructure.Tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmet(root.left,root.right);
    }


    public boolean isSymmet(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmet(left.left, right.right) && isSymmet(left.right, right.left);
    }
}
