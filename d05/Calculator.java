public class Calculator {

    public double add(int x, int y) {
        // use more precise double arithmetic
        return (double) x + y; // y gets converted implicitly
    }

    public double divide(int x, int y) {
        return (double) x / (double) y;
    }
}
