package spring_app1;

public class HelloVN implements Hello{

	@Override
	public void sayHello(String name) {
		System.out.println("Xin chao: " + name);
		
	}

}
