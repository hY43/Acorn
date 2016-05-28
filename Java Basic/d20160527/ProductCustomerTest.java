package d20160527;

public class ProductCustomerTest {
	public static void main(String[] args) {
		Car car = new Car();
		
		Producter p = new Producter(car);
		
		Customer c1 = new Customer(car);
		Customer c2 = new Customer(car);
		Customer c3 = new Customer(car);
		
		Thread th1 = new Thread(p);
		Thread th2 = new Thread(c1);
		Thread th3 = new Thread(c2);
		Thread th4 = new Thread(c3);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}
}
