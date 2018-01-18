package charlie.designpattern.behavior1.state;

import java.awt.*;

public class BlueState extends State {

	@Override
	public void handlePush(Context context) {
		// TODO Auto-generated method stub
		GreenState gs = new GreenState();
		context.setState(gs);
		System.out.println("Pushed color is " + gs.getColor());
	}

	@Override
	public void handlePull(Context context) {
		// TODO Auto-generated method stub
		RedState rs = new RedState();
		context.setState(rs);
		System.out.println("Pulled color is " + rs.getColor());
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return Color.BLUE;
	}

}
