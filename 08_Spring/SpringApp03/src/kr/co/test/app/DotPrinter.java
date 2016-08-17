package kr.co.test.app;

public class DotPrinter implements Printer{
	@Override
	public void printing(String msg) {
		System.out.println("찌징찌징~!" + msg);
	}
}
