public class Power {

    public static int pow(int base, int exponent) {
        // assume exponent >= 0
        if (exponent == 0) {
            return 1;
        }
        // 2^7 = 2 * 2^6
        return base * pow(base, exponent - 1);
    }

    public static int powLoop(int base, int exponent) {
        // assume exponent >= 0
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = base * result;
        }
        return result;
    }
}