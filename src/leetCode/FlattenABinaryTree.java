package leetCode;

import dataStructure.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class FlattenABinaryTree {

    //recursion left first, right then
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode copyLeft = root.left;
        TreeNode copyRight=root.right;
        flatten(copyLeft);
        flatten(copyRight);
        root.left = null;

        root.right = copyLeft;
        if(copyLeft==null){
            root.right=copyRight;
        }
        else if(copyLeft.right==null){
            copyLeft.right=copyRight;
        }
        else{
            while(copyLeft.right!=null)
                copyLeft=copyLeft.right;
            copyLeft.right=copyRight;
        }
    }

    //recursion right first, left then
    public void flattenRightFirst(TreeNode root){
        if(root==null) return;
        TreeNode tempRight = null;
        if (root.right != null) {
            flattenRightFirst(root.right);
            tempRight=root.right;
            root.right=null;//cut the right side from the root to avoid right side loop
        }
        if(root.left!=null) {
            flattenRightFirst(root.left);
            root.right=root.left;
            root.left=null;
            }
        TreeNode curr=root;
        while(curr.right!=null){
          curr=curr.right;
        }
        curr.right=tempRight;
    }




        private TreeNode prev;
    public void flattenII(TreeNode root){
        if(root==null) return;
        flattenII(root.right);//this step prev=root.right ,root.right.left=null
        flattenII(root.left);//this step root.left.right=root.right ,root.left.left=null ,prev=root.left
        root.right=prev;//this step root.right=root.left
        root.left=null;
        prev=root;
    }

    public void flattenIII(TreeNode root){
        if (root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(stack.size()>0){
            TreeNode curr = stack.pop();
            if (curr.right!=null){
                stack.push(curr.right);
            }
            if (curr.left!=null){
                stack.push(curr.left);
            }
            curr.left = null;
            queue.add(curr);
        }

        TreeNode curr = queue.poll();
        while (queue.size()>0){
            curr.right = queue.poll();
            curr = curr.right;
        }
    }
}


