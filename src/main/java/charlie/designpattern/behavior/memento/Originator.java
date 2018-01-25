package charlie.designpattern.behavior.memento;

/**
 * Created by charlie on 25/01/2018.
 */
public class Originator {
    private double x;
    private double y;
    private String lastUndoSavepoint;
    CareTaker careTaker;

    public Originator(double x, double y, CareTaker careTaker) {
        this.x = x;
        this.y = y;
        this.careTaker = careTaker;

        createSavepoint("INITIAL");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void createSavepoint(String savepointName) {
        careTaker.saveMemento(savepointName, new Memento(this.x, this.y));
        lastUndoSavepoint = savepointName;
    }

    public void undo() {
        setOriginator(lastUndoSavepoint);
    }

    public void undo(String savepointName) {
        setOriginator(savepointName);
    }

    public void undoAll() {
        setOriginator("INITIAL");
        careTaker.clearSavepoints();
    }

    public void setOriginator(String savepointName) {
        Memento memento = careTaker.getMemento(savepointName);
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
