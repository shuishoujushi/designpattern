package charlie.designpattern.behavior1.state;

import java.awt.*;

public class RedState extends State {

	@Override
	public void handlePush(Context context) {
		// TODO Auto-generated method stub
		BlueState bs = new BlueState();
		context.setState(bs);
		System.out.println("Pushed color is " + bs.getColor());
	}

	@Override
	public void handlePull(Context context) {
		// TODO Auto-generated method stub
		GreenState gs = new GreenState();
		context.setState(gs);
		System.out.println("Pulled color is " + gs.getColor());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.RED;
	}

}
