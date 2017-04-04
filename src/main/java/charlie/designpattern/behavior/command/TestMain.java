package charlie.designpattern.behavior.command;

import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Command> queue = Producer.produceRequest();
		for (Command c : queue) {
			c.execure();
		}
	}

}
