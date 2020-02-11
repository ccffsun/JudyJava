package leetCode;

public class TrailingZeros {
    public long trailingZeros(long n){
        long res = factorial(n);
        long num=0;
        while(res%10!=0){
            res=res/10;
            num++;
        }
        return num;
    }

    public long factorial(long n){
        long res= 1;

        for(long i =1; i <= n; i++){
         res= res * i;
        }
        return res;
    }
}
