package spring_app_hw_app1;

public class HelloImple implements Hello{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void sayHello() {
		System.out.println("안녕하세요 " + name + "님");
	}
}
