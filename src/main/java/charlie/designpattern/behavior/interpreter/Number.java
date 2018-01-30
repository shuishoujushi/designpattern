package charlie.designpattern.behavior.interpreter;

/**
 * Created by charlie on 30/01/2018.
 */
public class Number implements Expression {
    private final int n;

    public Number(int n) {
        this.n = n;
    }

    @Override
    public int interpret() {
        return n;
    }
}
