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
            TreeNode peek = queue.peek();   *********you should check if queue.peek() is null or not
            */
            int levelNum =queue.size();
            List<Integer> subList=new LinkedList<>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.add(queue.peek().right);
                }
                subList.add(queue.poll().val); //make sure levelNum is equal to queue.size, the same time poll the
                //TreeNodes from the same level ,this is the most important step of the loop;
            }
            wrap.add(subList);
        }
        return wrap;
    }
}
