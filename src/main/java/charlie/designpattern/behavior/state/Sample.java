package charlie.designpattern.behavior.state;

import java.awt.*;

public class Sample {

	private Color color;
	
	public Sample(Color color) {
		this.color = color;
	}

	public void operate() {
		// process the individual state
		System.out.println("Operate the color is --> " + color);
	}
}
