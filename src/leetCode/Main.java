package leetCode;

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

    }
}
