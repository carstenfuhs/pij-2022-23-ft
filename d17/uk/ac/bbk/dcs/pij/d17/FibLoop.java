package uk.ac.bbk.dcs.pij.d17;

public class FibLoop {
    public static int fibIterative(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        // n > 2: fib(n) = fib(n-2) + fib(n-1)
        int secondToLast = 1;
        int last = 1;
        int result = -1; // dummy initalisation
        for (int i = 3; i <= n; i++) {
            result = secondToLast + last; // now contains fib(i)
            secondToLast = last;
            last = result;
        }
        return result;
    }
}
