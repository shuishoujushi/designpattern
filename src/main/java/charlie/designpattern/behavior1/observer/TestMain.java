package charlie.designpattern.behavior.observer;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product();
		
		NameObserver no = new NameObserver();
		PriceObserver po = new PriceObserver();
		
		product.addObserver(no);
		product.addObserver(po);
		
		product.setName("Macbook");
		product.setPrice(9900);
	}

}
