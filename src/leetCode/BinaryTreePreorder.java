package leetCode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new LinkedList<Integer>();
        if(root!=null){
            ans.add(root.val);
            ans.addAll(preorderTraversal(root.left));//why addAll()?
            ans.addAll(preorderTraversal(root.right));//This method is used to
            // append all of the elements from the collection passed as parameter
            // to this function to the end of a list keeping in mind the order of
            // return by the collections iterator.
        }
        return ans;
    }
}
