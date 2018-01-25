package charlie.designpattern.behavior.memento;

/**
 * Created by charlie on 25/01/2018.
 */
public class Memento {
    private double x;
    private double y;

    public Memento(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
