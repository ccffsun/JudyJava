package leetCode;

public class PowXN {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        //because INT_MIN is -2147483648 but INT_MAX is 2147483647 ,so n = -n is failed!!
        if (n==Integer.MIN_VALUE){
            x=x*x;
            n=n/2;
        }
        else if (n<0){
            n=-n;
            x=1/x;
        }
        return (n%2==0)? myPow(x*x,n/2) : x*myPow(x*x,n/2);
    }
}
