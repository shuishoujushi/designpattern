package charlie.designpattern.behavior.interpreter;

/**
 * Created by charlie on 30/01/2018.
 */
public class ExpressionUtils {

    public static boolean isOperator(String s) {
        if ("+".equals(s) || "-".equals(s) || "*".equals(s)) {
            return true;
        } else {
            return false;
        }
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+": return new Add(left, right);
            case "-": return new Substract(left, right);
            case "*": return new Product(left, right);
        }
        return null;
    }

}
