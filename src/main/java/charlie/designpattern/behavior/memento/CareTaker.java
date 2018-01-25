package charlie.designpattern.behavior.memento;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by charlie on 25/01/2018.
 */
public class CareTaker {
    private final Map<String, Memento> savepointStorage = new HashMap<>();

    public void saveMemento(String savepoint, Memento memento) {
        System.out.println("Saving state..." + savepoint);
        savepointStorage.put(savepoint, memento);
    }

    public Memento getMemento(String savepoint) {
        System.out.println("Undo at ... " + savepoint);
        return savepointStorage.get(savepoint);
    }

    public void clearSavepoints() {
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }
}
