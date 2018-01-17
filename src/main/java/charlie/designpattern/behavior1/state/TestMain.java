package charlie.designpattern.behavior.state;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c = new Context();
		c.setState(new BlueState());
		
		c.push();
//		c.pull();
	}

}
