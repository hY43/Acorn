package spring_app2;

public class CoffeeImple implements Coffee{
	/*Member Variable*/
	String type;
	
	/*Get/Set Method*/
	public String getType(){return type;}
	public void setType(String type){this.type = type;}
	
	@Override
	public void drink(String name) {
		System.out.println(name + "님이 " + type + "을/를 홀짝홀짝 마셔요");	
	}
	
}
