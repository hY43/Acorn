package kr.co.test.app;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloImple implements Hello{
	@Override
	public void printHello(String msg) {
		System.out.println("Hello: " + msg);
	}
}
