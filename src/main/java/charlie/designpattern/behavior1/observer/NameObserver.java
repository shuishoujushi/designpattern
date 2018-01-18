package charlie.designpattern.behavior1.observer;

import java.util.Observable;
import java.util.Observer;

public class NameObserver implements Observer {

	private String name = null;
	
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof String) {
			name = (String) arg;
			System.out.println("NameObserver: name changed to -> " + name + ".");
		}
	}

}
