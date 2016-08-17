package kr.co.test.app;

public class InkjetPrinter implements Printer{

	@Override
	public void printing(String msg) {
		System.out.println("슥슥슥슥 " + msg);
	}

}
