package leetCode;

public class FlattenABinaryTree {
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
        private TreeNode prev;
    public void flattenII(TreeNode root){
        if(root==null) return;
        flattenII(root.right);
        flattenII(root.left);
        root.right=prev;
        root.left=null;
        prev=root;
    }
}


