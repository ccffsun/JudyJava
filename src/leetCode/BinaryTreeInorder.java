package leetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new LinkedList<Integer>();
        if(root!=null){
            ans.addAll(inorderTraversal(root.left));
            ans.add(root.val);
            ans.addAll(inorderTraversal(root.right));
        }
        return ans;
    }
}
