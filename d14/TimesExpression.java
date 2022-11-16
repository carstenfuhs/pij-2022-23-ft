/**
 * Represents an Expression of the form (e1 * e2).
 */
public class TimesExpression extends BinaryExpression {

    /**
     * Constructs a TimesExpression with left and right as direct
     * subexpressions.
     *
     * @param left the left subexpression
     * @param right the right subexpression
     * @throws NullPointerException if left or right is null
     */
    public TimesExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * @return the product of the values of the direct subexpressions
     */
    @Override
    public int value() {
        return this.getLeft().value() * this.getRight().value(); 
    }

    @Override
    public String toString() {
        // or: move implementation to BinaryExpression, pass operator symbol
        // in the constructor to BinaryExpression and store it there
        //     super(left, right, "*");
        return "(" + this.getLeft() + " * " + this.getRight() + ")";
    }
}
