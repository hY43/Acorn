package kr.co.test.app;

public class StaticConnectionManager {
	public static String msg = "static 변수";
	
	static {
		System.out.println("static block");
	}
	
	public StaticConnectionManager(){
		System.out.println("기본 생성자");
	}
	
	public static void print(){
		System.out.println("static Mehtod");
	}
}
