package leetCode;

import dataStructure.Tree;

import java.util.Stack;

public class SymmetricTree {

    //recursive
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmet(root.left,root.right);
    }

    private boolean isSymmet(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmet(left.left, right.right) && isSymmet(left.right, right.left);
    }


    //non-recursive
    public boolean isSymmetricII(TreeNode root){
       if(root==null) return true;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while(stack.size()!=0){
            TreeNode pop1=stack.pop();
            TreeNode pop2=stack.pop();
            if(pop1==null&&pop2==null) continue;  //自动走到最后 return true
            if(pop1==null||pop2==null||pop1.val!=pop2.val){
                return false;
            }
            stack.push(pop1.right);
            stack.push(pop2.left);
            stack.push(pop1.left);
            stack.push(pop2.right);
        }
        return true;     //当出现false时自动返回，否则就是true
    }
}
