package kr.co.test.app;

public class LaserPrinter implements Printer{

	@Override
	public void printing(String msg) {
		System.out.println("찌이이이잉 " + msg);
	}

}
