package leetCode;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    public  boolean helper(TreeNode root, Integer min, Integer max){
        if(root==null) return true;
        if((min!=null && root.val<=min)|| (max!=null && root.val>=max)) return  false;
        boolean left =helper(root.left,min,root.val);
        boolean right =helper(root.right,root.val,max);
        return left && right;
    }

}
