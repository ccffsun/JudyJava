package leetCode;

public class AddTwoNums {
/*

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int L=0;
            this.NotNullSum(l1,l2);
            ListNode head =new ListNode(this.NotNullSum(l1,l2));
                head.next=
            while (true){
                if((l1!=null)&&(l2!=null)){
                    this.NotNullSum(l1,l2);
                }
                else if((l1==null)&&(l2 !=null)){1`
                   L=l2.val;
                   l2=l2.next;
                }
                else if((l1!=null)&&(l2==null)){
                    L=l1.val;
                    l1=l1.next;
                }
                ListNode M = new ListNode(L);

                M=M.next;
            }
        }
        public int NotNullSum (ListNode a , ListNode b){
            if (a!=null && b!=null) {
                int L;
                int carry = 0;
                L = a.val + b.val + carry;
                if (L >= 10) {
                    carry = 1;
                    L = L - 10;
                    a = a.next;
                    b = b.next;
                }
                return L;
            }
            throw new IllegalArgumentException("INPUT CAN'T BE NULL");
        }
    }

 */
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode m= l1, n=l2;
       ListNode now = head;
       int carry =0;
       while (m!=null || n!=null) {
           int x = (m != null) ? m.val : 0;
           int y = (n != null) ? n.val : 0;
           int sum = x + y + carry;
           carry = sum / 10;
           now.next = new ListNode(sum % 10);
           now = now.next;
           if (m!=null) m=m.next;
           if (n!=null) n=n.next;
       }

       if (carry>0) now.next= new ListNode(carry);
       return head.next;
   }
}
