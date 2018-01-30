package charlie.designpattern.behavior.interpreter;

/**
 * Created by charlie on 30/01/2018.
 */
public class Substract implements Expression {
    private final Expression leftExpression;
    private final Expression rightExpression;

    public Substract(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int interpret() {
        return leftExpression.interpret() - rightExpression.interpret();
    }
}
