package charlie.designpattern.behavior1.chainofresponsibility;

public class Request {

	private String type;
	
	public Request(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void execute() {
		//Request real execution code
		
	}
}
