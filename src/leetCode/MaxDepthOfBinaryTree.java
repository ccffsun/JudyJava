package leetCode;

import java.util.Stack;

public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int maxDepth = Integer.MIN_VALUE;
        int depth ;
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return 0;
        stack.push(root);
        while (stack.size() != 0) {
            TreeNode peek = stack.peek();
            stack.pop();
            count++;

            if (peek.left != null) {
                stack.add(peek.left);

            }
            if (peek.right != null) {
                stack.add(peek.right);
            }
            if(peek.left==null&&peek.right==null){
               depth=count;
               maxDepth=Math.max(maxDepth,depth);
               count--;
            }
        }
        return  maxDepth;
    }
}

