package charlie.designpattern.behavior.state;

import java.awt.*;

public class GreenState extends State {

	@Override
	public void handlePush(Context context) {
		// TODO Auto-generated method stub
		RedState rs = new RedState();
		context.setState(rs);
		System.out.println("Pushed color is " + rs.getColor());
	}

	@Override
	public void handlePull(Context context) {
		// TODO Auto-generated method stub
		BlueState bs = new BlueState();
		context.setState(bs);
		System.out.println("Pulled color is " + bs.getColor());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.GREEN;
	}

}
