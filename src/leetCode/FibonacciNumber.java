package leetCode;

import java.util.HashMap;

public class FibonacciNumber {
    public int fib(int N) {
        int[] f = new int[N + 1];
        if (N <= 1) {
            return N;
        } else {
            int i;
            f[0] = 0;
            f[1] = 1;
            for (i = 2; i <= N; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            return f[N];
        }
    }

    public int fib2(int n) {
        int res;
        if (n == 0 || n == 1) res = 1;
        else res = fib2(n - 1) + fib2(n - 2);
        return res;
    }

    HashMap<Integer, Integer> mp = new HashMap<>();

    public int fib3(int n) {
        int res;
        if (mp.containsKey(n)) {
            return mp.get(n);
        }
        if (n == 0) {
            res = 0;
        } else if (n == 1) {
            res = 1;
        } else {
            res = fib3(n - 1) + fib3(n - 2);
        }

        mp.put(n, res);
        return res;
    }

    public int fib4(int n) {
        int a = 0;
        int b = 1;
        int temp;
        if (n == 0) {
            b = 0;
        } else if (n == 1) {
            b = 1;
        } else {
            for (int i = 2; i <=n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
        }
        return b;
    }
}


