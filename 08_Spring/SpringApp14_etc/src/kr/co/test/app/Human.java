package kr.co.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Human implements Character{
	String name;
	int age;
	
	public Human(){}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat(String it) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(Object obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void status() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age + "세");
		
	}

}
