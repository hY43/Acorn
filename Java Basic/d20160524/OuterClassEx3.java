package d20160524;

public class OuterClassEx3 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;

	public void printAll() {
		// Class가 지역 변수 처럼 함수 내부에서 선언되어 사용.
		// 지역 변수 처럼 여겨지기 때문에 OuterClassEx3이 instance화 되어야 사용 가능하다.
		// 때문에 static 변수는 사용할 수 없다
		class LocalInnerClass{
			int d = 30;
			// static int e = 40;
			static final int f = 40;

			public void print() {
				System.out.println("a: " + a);
				System.out.println("b: " + b);
				System.out.println("c: " + c);
				System.out.println("d: " + d);
				// System.out.println("e: " + e);
				System.out.println("f: " + f);
			} // print() End
		} // LocalInnerClass End
		// printAll() Method가 끝나면 InnerClass 역시 사라지기 때문에 그전에 사용해야 한다.
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	} // printAll() End

	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
}
