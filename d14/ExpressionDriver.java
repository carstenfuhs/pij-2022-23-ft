/**
 * Driver class ("script") for working with the Expression hierarchy.
 */
public class ExpressionDriver {

    public static void main(String[] args) {
        Expression intExp1 = new IntConstant(8);
        Expression intExp2 = new IntConstant(10);
        Expression plusExp = new PlusExpression(intExp1, intExp2);
        Expression timesExp = new TimesExpression(intExp1, plusExp); // cheeky reuse of intExp1
        Expression divExp = new DivExpression(intExp2, intExp1);
        System.out.println("(8 + 10) = " + plusExp.value());
        System.out.println("(8 + 10) has " + plusExp.numberOfNodes() + " nodes");
        System.out.println(plusExp.toString());
        System.out.println(intExp1.toString());
        System.out.println(timesExp.toString());
    
        System.out.println(divExp + " = " + divExp.value());
        System.out.println(divExp + " has " + divExp.numberOfNodes() + " nodes");
    }
}
