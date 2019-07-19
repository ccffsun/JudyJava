package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeBFS {
    public void btBFS(TreeNode root){
        Queue<TreeNode> queue =new LinkedList<>();
        if(root==null) return;
        queue.add(root);
        while(queue.size()!=0){
            TreeNode peek=queue.peek();
            if(peek.left!=null){
                queue.add(peek.left);
            }
            if(peek.right!=null){
                queue.add(peek.right);
            }
            System.out.print(queue.poll().val+" ");
        }
    }
}
