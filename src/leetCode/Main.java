package leetCode;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String [] args){
       /*
        System.out.println("Hello world !");
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        int [] a={1,1,2,3,3,5,7,8,8,9};
        int u=test.removeDuplicates(a);
        System.out.println(u);
        RemoveElement removeE =new RemoveElement();
        int [] b={1,2,3,4,5,5,3,4,5,2,0,4};
        int v=removeE.removeElement(b,4);
        System.out.println(v);

        ReverseInteger RI = new ReverseInteger();
        int ri =RI.reverse(-153478239);
        System.out.println(ri);

        //two sum
        TwoSum tw = new TwoSum();
        int [] r={1,2,100,3,5,6};
        int[] s=tw.twoSum(r,106);
        System.out.println(s[0]+","+s[1]);
        int[] s2=   tw.hashTwoSum(r,106);
        System.out.println(s2[0]+","+s2[1]);

        //Add two Numbers
        AddTwoNums atn = new AddTwoNums();
        ListNode m = new ListNode(1);
        ListNode m2 = new ListNode(2);
        ListNode m3 = new ListNode(3);
        ListNode m4 = new ListNode(4);
        m.next=m2;
        m2.next=m3;
        m3.next=m4;

        ListNode n = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5= new ListNode(5);
        ListNode n6=new ListNode(6);
        n.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        ListNode output = atn.addTwoNumbers(m,n);
        System.out.println(output.val);

        //swap nodes in pairs
        SwapNodesInPairs snip =new SwapNodesInPairs();
        ListNode x =snip.swapPairs(m);
        System.out.println(x.val);
        while(x!=null){
            System.out.println(x.val);
            x=x.next;
        }
        //move0AheadOfArray
        Move0AheadOfArray m0a=new Move0AheadOfArray();
        int[] ma={1,1,0};
        int[] m0=m0a.move0Ahead(ma);
        for(int mint :m0){
            System.out.print(mint);
        }

        System.out.println();

        int[] m1=m0a.move0AheadII(ma);
        for(int mint:m1){
            System.out.print(mint);
        }

        System.out.println();

        int[]mo={1,2,4,1,7,8,3};
        RemoveDuplicatesFromSortedArrayII removeII=new RemoveDuplicatesFromSortedArrayII();
        int num=removeII.removeDuplicates(mo);
        System.out.println(num);


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

       /*ImplementQueueUsingStack myQueue =new ImplementQueueUsingStack();
        myQueue.MyQueue();
        myQueue.push(3);
        myQueue.push(2);
        int pa2=myQueue.peek();
        int pa3=myQueue.pop();

        boolean pa4=myQueue.empty();

        System.out.println(pa2+" "+pa3+" "+pa4);

        /*
        Stack<Integer> testStack = null;
        testStack.push(1);
         */

        /*Hannoi h = new Hannoi();
        h.move(3,"A","B","C");

        MaxSumOfNoAdjectElement maxsum= new  MaxSumOfNoAdjectElement();
        int f=maxsum.maxSum(mo,6);
        System.out.println(f);


        // int[]mo={1,2,4,1,7,8,3};
        TargetSumOfArray ts= new TargetSumOfArray();
        boolean tsa=ts.targetSumOfArray(mo,100);
        System.out.println(tsa);


        int[]moo={4,6,-1,3,8,5,-11};
        MinimunSizeSubArraySum ms= new MinimunSizeSubArraySum();
        int mms=ms.minSubArrayLen(11,moo);
        System.out.println(mms);
        LongestSubStringWithoutRepeatingCharacters lssw=new LongestSubStringWithoutRepeatingCharacters();
        int l=lssw.lengthOfLongestSubstring("");
        System.out.println(l);
        MinimunWindowSubstring mws=new MinimunWindowSubstring();
        String c=mws.minWindow("cabwefgewcwaefgcf" ,"cae");
        System.out.println(c);
        */

       /*
        int[]moo={4,6,-1,3,8,5,-11};
        KthLargest kth= new KthLargest(4,moo);
        System.out.println("\n+*");
        int k1=kth.add(100);
        int k2=kth.add(50);
        int k3=kth.add(7);
        int k4=kth.add(-2);
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);

        String preordertree ="1-2--3--4-5--6--7";
        RecoverATreeFormPreorderTraversal rt=new RecoverATreeFormPreorderTraversal();
        TreeNode root  =rt.recoverFromPreorder(preordertree);
        System.out.println(root.val+" "+root.left.val+" "+root.right.val);
        ReverseList rs= new ReverseList();
        */
        /*ListNode e=rs.reverseList(n);
        while(e!=null) {
            System.out.println(e.val);
            e = e.next;
        }

         */
       /* ReverseLinkedListII rs2=new ReverseLinkedListII();
        ListNode f=rs2.reverseBetween(n,2,4);
        while(f!=null){
            System.out.println(f.val);
            f=f.next;
        }

        */
        ListNode n = new ListNode(4);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);
        ListNode n5= new ListNode(0);
        ListNode n6=new ListNode(-1);
        ListNode n7=new ListNode(10);
        n.next=n2;
        n2.next=n3;
        n3.next=n4;
        //n4.next=n5;
        //n5.next=n6;
        //n6.next=n7;
        /*PartitionList pl=new PartitionList();
        ListNode partition=pl.partition(n,3);
        while (partition!=null) {
            System.out.println(partition.val);
            partition = partition.next;

         */
        /*RemoveDuplicatesFromSortedListII rsl=new RemoveDuplicatesFromSortedListII();
        ListNode dd=rsl.deleteDuplicates(n);
        while (dd!=null){
            System.out.println(dd.val);
            dd=dd.next;
        }

         */

        InsertionSortList insert=new InsertionSortList();
        ListNode ans=insert.insertionSortList(n);
        while(ans!=null){
            System.out.println(ans.val);
            ans=ans.next;
        }
        System.out.println("###############");
        ListNode r = new ListNode(0);
        ListNode r2 = new ListNode(1);
        ListNode r3 = new ListNode(2);
        ListNode r4 = new ListNode(3);
        r.next=r2;
        r2.next=r3;
        r3.next=r4;
        int[] g={0,1,3};

        ListNode v = new ListNode(5);
        ListNode v2 = new ListNode(6);
        ListNode v3 = new ListNode(7);
        ListNode v4 = new ListNode(9);
        v.next=v2;
        v2.next=v3;
        v3.next=v4;

        ListNode w=null;

        ListNode u = new ListNode(-1);
        ListNode u2 = new ListNode(12);
        ListNode u3 = new ListNode(20);
        ListNode u4 = new ListNode(100);
        u.next=u2;
        u2.next=u3;
        u3.next=u4;

        ListNode y=null;

        ListNode [] abs=new ListNode[5];
        abs[0]=w;
        abs[1]=r;
        abs[2]=v;
        abs[3]=y;
        abs[4]=u;


       /*
        LinkedListComponents lc=new LinkedListComponents();
        int number =lc.numComponents(r,g);
        System.out.println(number);
       */

        /*
        RotateList rl=new RotateList();
        ListNode rotate=rl.rotateRightII(r,2000000);
        while(rotate!=null){
            System.out.println(rotate.val);
            rotate=rotate.next;
        }

         */
        MergeKSortedLists mkl= new MergeKSortedLists();
        ListNode newMkl= mkl.mergeKLists(abs);
        while(newMkl!=null){
            System.out.println(newMkl.val);
            newMkl=newMkl.next;
        }

        PalindromeNumber p=new PalindromeNumber();
        boolean boo=p.isPalindrome(67);
        System.out.println(boo);
    }
}
