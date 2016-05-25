package d20160524;

public class OuterClassEx3 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;

	public void printAll() {
		// Class�� ���� ���� ó�� �Լ� ���ο��� ����Ǿ� ���.
		// ���� ���� ó�� �������� ������ OuterClassEx3�� instanceȭ �Ǿ�� ��� �����ϴ�.
		// ������ static ������ ����� �� ����
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
		// printAll() Method�� ������ InnerClass ���� ������� ������ ������ ����ؾ� �Ѵ�.
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	} // printAll() End

	public static void main(String[] args) {
		OuterClassEx3 oce3 = new OuterClassEx3();
		oce3.printAll();
	}
}
