package d20160524;

public class OuterClassEx2 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;
	// Static Inner Class : Static �̹Ƿ� Instance�� �������� �ʾƵ� ������ �����ϴ�.
	// �׷��Ƿ� static ������ ���� �� �ִ�.
	static class StaticInnerClass{
		int d = 30;
		static int e = 40;
		static final int f = 40;

		public void print() {
			//System.out.println("a: " + a); // non-static�� ������ ���� X
			System.out.println("b: " + b);
			System.out.println("c: " + c);
			System.out.println("d: " + d);
			System.out.println("e: " + e);
			System.out.println("f: " + f);
		}
	} // StaticInnerClass End
	
	public static void main(String[] args) {
		// ���� Outer Class�ʹ� ������ �����ϹǷ� ��ü ������ �����ϴ�.
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	}
}
