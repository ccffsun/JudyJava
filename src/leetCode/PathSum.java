package leetCode;


//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//Note: A leaf is a node with no children.
//
//Example:
//
//Given the below binary tree and sum = 22,
//
//      5
//     / \
//    4   8
//   /   / \
//  11  13  4
// /  \      \
//7    2      1
//return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.


import dataStructure.Tree;

import java.util.Stack;

//recursive    sum - root.val
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
     if(root==null) return false;
     if(root.left==null&&root.right==null) return root.val==sum;
     return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }


    public boolean hasPathSumII(TreeNode root, int sum){
        Stack<TreeNode> stack=new Stack<>();
        Stack<Integer> sums=new Stack<>();

        stack.push(root);
        sums.push(sum);

        while(stack.size()!=0 && root!=null){
            TreeNode top= stack.pop();
            int value= sums.pop();

            if(top.left==null&&top.right==null&&top.val==value){
                return true;
            }
            if(top.left!=null){
                stack.push(top.left);
                sums.push(value-top.val);
            }
            if(top.right!=null){
                stack.push(top.right);
                sums.push(value-top.val);
            }
        }
        return false; //出口为 if(top.left==null&&top.right==null&&top.val==value) return true;

    }
}


