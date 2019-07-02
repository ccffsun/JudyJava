package leetCode;

public class LowestCommonAncestorOfABST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            return left;
        } else if (root.val < p.val && root.val < q.val) {
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            return right;
        } else return root;
    }
    public TreeNode lcaBST(TreeNode root,TreeNode p,TreeNode q){
        while (true){
            if (root.val<p.val && root.val<q.val){
                root=root.right;
            }
            else if(root.val>p.val && root.val>q.val){
                root=root.left;
            }
            else return root;
        }
    }
}
