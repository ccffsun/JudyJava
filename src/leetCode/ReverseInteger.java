package leetCode;

public class ReverseInteger {
    public int reverse(int x) {
        int n = (int) Math.log10(Math.abs(x)) + 1;
        long NewNum = 0;

            for (int i = 1; i <= n; i++) {
                long u = (long) Math.pow(10, n - i);
                long v = (long) Math.pow(10, i - 1);
                long quotient = x / u;
                x = (int)(x % u);
                NewNum = NewNum + quotient * v;
            }
            if (NewNum > Integer.MAX_VALUE || NewNum < Integer.MIN_VALUE) {
                return 0;
            } else {
                return (int)NewNum;
            }
        }

    }


// public int reverse(int x) {
//        long result = 0;
//
//        while(x!=0){
//            result = result * 10 + x%10;
//            x /= 10;
//        }
//
//        return (int)result;
//    }