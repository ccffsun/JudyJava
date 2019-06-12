package leetCode;

import java.util.List;

public class Main {
    public static void main(String [] args){
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
        ListNode m = new ListNode(2);
        ListNode m2 = new ListNode(5);
        ListNode m3 = new ListNode(7);
        ListNode m4 = new ListNode(9);
        m.next=m2;
        m2.next=m3;
        m3.next=m4;

        ListNode n = new ListNode(4);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(9);
        n.next=n2;
        n2.next=n3;
        n3.next=n4;
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
        int[] ma={0,1,1,0,0,0,1,1,1,0,0,0,1};
        int[] m0=m0a.move0Ahead(ma);
        for(int mint :m0){
            System.out.print(mint);
        }
        int[] m1=m0a.move0AheadII(ma);
        for(int mint:m1){
            System.out.print(mint);
        }

    }
}
