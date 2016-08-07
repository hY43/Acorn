package hW20160517;

public class Animal {
	// Member Varible
	private String name;
	private int age;
	
	// Constructor
	Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// Member Method
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}
	public void show() {
		System.out.println(name + "는(은) " + age + " 살입니다.");
	}

}
