package leetCode;

import dataStructure.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraveral {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        List<List<Integer>> wrap=new LinkedList<List<Integer>>();
        if(root==null) return wrap;//not return null

        queue.add(root);

        while(queue.size()!=0){
           /*
            TreeNode peek = queue.peek();   *********
            */

            int levelNum =queue.size();
            List<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                TreeNode peek=queue.peek();//peek will refresh every  time queue.poll(),so peek should in the for loop
                if(peek.left!=null){
                    queue.add(peek.left);
                }
                if(peek.right!=null){
                    queue.add(peek.right);
                }
                subList.add(queue.poll().val); //make sure levelNum is equal to queue.size, the same time poll the
                //TreeNodes from the same level ,this is the most important step of the loop;

            }
            wrap.add(subList);
        }
        return wrap;
    }
}
