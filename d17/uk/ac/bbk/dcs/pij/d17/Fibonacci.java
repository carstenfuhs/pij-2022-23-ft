package uk.ac.bbk.dcs.pij.d17;

public class Fibonacci {
    // arrays are 0-based, so F(1) is stored at position 0, etc
    private int[] precalculated = null;

    // Fibonacci number are always positive
    private static final int UNKNOWN = -1;

    public int fib(int n) {
        if (this.precalculated == null) {
            initPrecalculatedArray(n);
        }
        if (this.precalculated[n-1] != UNKNOWN) {
            return this.precalculated[n-1];
        } else {
            int result = fib(n-1) + fib(n-2);
            this.precalculated[n-1] = result;
            return result;
        }
    }
    private void initPrecalculatedArray(int size) {
        this.precalculated = new int[size];
        for (int i = 0; i < precalculated.length; i++) {
            this.precalculated[i] = UNKNOWN;
        }
        this.precalculated[0] = 1; // F(1)
        this.precalculated[1] = 1; // F(2)
    }
}
