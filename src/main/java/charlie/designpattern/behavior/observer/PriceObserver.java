package charlie.designpattern.behavior.observer;

import java.util.Observable;
import java.util.Observer;

public class PriceObserver implements Observer {

	private float price = 0;
	
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (arg instanceof Float) {
			price = (Float) arg;
			System.out.println("PriceObserver: price changed to -> " + price + ".");
		}
	}

}
