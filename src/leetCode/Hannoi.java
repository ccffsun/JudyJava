package leetCode;

public class Hannoi {
    //move is move n disks from a to c by b
    public void move(int n, String a, String b, String c){
        if(n==0){
            return;
        }
        move(n-1,a,c,b);
        System.out.println(a+"->"+c);
        move(n-1,b,a,c);
    }
}
