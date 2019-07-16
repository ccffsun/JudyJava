package leetCode;

import java.util.Stack;

public class RecoverATreeFormPreorderTraversal {
    public TreeNode recoverFromPreorder(String S) {
        int x;
        int val;
        int dashCounter=0;
        Stack<TreeNode> nodeContainer =new Stack<>();
        Stack<Integer> deepth=new Stack<>();

        deepth.push(0);

        char [] target =S.toCharArray();
         x=Character.getNumericValue(target[0]);
        TreeNode root = new TreeNode(x);
        int length =target.length;
        for(int i=1;i<length;i++){
            if(target[i]!='-'){
             val=Character.getNumericValue(target[i]);
             TreeNode node = new TreeNode(val);

             nodeContainer.push(node);
             int tempDeepth=deepth.peek();
             while(deepth.peek()==tempDeepth&&!deepth.empty()){
                 deepth.pop();
                 nodeContainer.pop();
            }
             if(nodeContainer.peek().left==null){
                 nodeContainer.peek().left=node;

             }else {
                 nodeContainer.peek().right=node;
                 nodeContainer.pop();
             }
                nodeContainer.push(node);

            if(i<length-1&&target[i+1]!='-') {
                dashCounter++;
                deepth.push(dashCounter);
                dashCounter = 0;
            }
            else dashCounter++;
            }
        }
        return root;
    }
}
