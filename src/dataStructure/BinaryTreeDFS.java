package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeDFS {
    public void btDFS(TreeNode root){
        Stack<TreeNode> stack =new Stack<>();
        if(root==null) return;
        stack.add(root);
        while(stack.size()!=0){
            TreeNode peek=stack.peek();
            System.out.print(stack.pop().val+" ");
            if(peek.left!=null){
                stack.add(peek.left);
            }
            if(peek.right!=null){
                stack.add(peek.right);
            }
        }
    }
    public void btDFSRECUR(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        if(root.left!=null){
            btDFSRECUR(root.left);
        }
        if(root.right!=null){
            btDFSRECUR((root.right));
        }
    }
}

