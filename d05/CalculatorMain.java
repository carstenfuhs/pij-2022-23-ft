public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double z = calc.add(2000000000,2000000000);
        System.out.println(z);
        z = calc.divide(12,5);
        System.out.println(z);
    }
}
