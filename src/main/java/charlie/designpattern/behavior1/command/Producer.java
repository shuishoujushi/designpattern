package charlie.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Producer {

	public static List<Command> produceRequest() {
		List<Command> queue = new ArrayList<Command>();
		queue.add(new Engineer());
		queue.add(new Programmer());
		
		return queue;
	}
}
