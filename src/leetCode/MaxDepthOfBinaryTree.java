package leetCode;

import java.util.LinkedList;
import java.util.Queue;
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
    public int maxDepthII(TreeNode root){
        if(root==null){
            return 0;
        }
        int ans=Math.max(maxDepthII(root.left),maxDepthII(root.right))+1;
        return ans;
        }

     public int maxDepthIII(TreeNode root){
        if(root==null) return 0;
        Queue<TreeNode>queue =new LinkedList<>();
        queue.add(root);
        int count=0;

        while(queue.size()!=0){
           int size=queue.size();

           while(size-->0){
               TreeNode curr=queue.poll();
               if(curr.left!=null){
                   queue.add(curr.left);
               }
               if(curr.right!=null){
                   queue.add(curr.right);
               }
           }
            count++;
        }
        return  count;
     }

}

