package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RecoverATreeFormPreorderTraversal {
    /*
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

     */

        //Hashmap  :levels (curLevel,curNode)
        public TreeNode recoverFromPreorder(String S) {

            Map<Integer, TreeNode> levels = new HashMap<>();
            int i = 0;
            while(i < S.length()) {
                int curLevel = 0, curNum = 0; // initialise in the loop
                while(i < S.length() && S.charAt(i) == '-') {
                    ++curLevel;
                    ++i;
                }
                while(i < S.length() && S.charAt(i) >= '0' && S.charAt(i) <= '9') {
                    curNum = curNum*10 + (S.charAt(i) - '0'); //read number like "123" ;S.charAt(i)-'0' is int type
                    i++;
                }
                TreeNode curNode = new TreeNode(curNum);
                levels.put(curLevel, curNode);
                if(curLevel > 0) {
                    TreeNode parent = levels.get(curLevel - 1);
                    if(parent.left == null) parent.left = curNode;
                    else parent.right = curNode;
                }
            }
            return levels.get(0);
        }


        public TreeNode recoverFromPreOrderII(String s){
            int level=0;
            int val=0;
            Stack<TreeNode> stack =new Stack<>();
             for(int i=0;i<s.length();){

                 for(level=0; i<s.length()&&s.charAt(i)=='-';i++){
                     level++;
                 }
                 for(val=0;i<s.length()&&s.charAt(i)!='-';i++){
                     val=val*10+(s.charAt(i)-'0');
                 }
             }
             while(stack.size()>level){//带表现在的Node与peek是同一深度的节点，size和level一致时代表两个节点是父子关系
               stack.pop();
             }
             TreeNode node=new TreeNode(val);
             if(stack.size()!=0) {
                 TreeNode peek = stack.peek();
                 if (peek.left != null) {
                     peek.left = node;
                 } else peek.right = node;
                 stack.add(node);
             }
            while(stack.size()>1) {  //输出最后一个节点 根节点
                stack.pop();
            }
            return stack.pop();
        }

    }


