package charlie.designpattern.behavior.chainofresponsibility;

public class ConcreteHandler implements Handler {

	private Handler handler;
	
	public ConcreteHandler(Handler handler) {
		this.handler = handler;
	}
	
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
//		if (request instanceof HelpRequest) {
//			//Process Help action
//		} else if (request instanceof PrintRequest) {
//			request.execute();
//		} else {
//			//pass to next request processor
//			
//		}
	}

}
