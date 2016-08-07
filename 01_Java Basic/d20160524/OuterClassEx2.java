package d20160524;

public class OuterClassEx2 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;
	// Static Inner Class : Static 이므로 Instance를 생성하지 않아도 접근이 가능하다.
	// 그러므로 static 변수도 가질 수 있다.
	static class StaticInnerClass{
		int d = 30;
		static int e = 40;
		static final int f = 40;

		public void print() {
			//System.out.println("a: " + a); // non-static한 변수는 접근 X
			System.out.println("b: " + b);
			System.out.println("c: " + c);
			System.out.println("d: " + d);
			System.out.println("e: " + e);
			System.out.println("f: " + f);
		}
	} // StaticInnerClass End
	
	public static void main(String[] args) {
		// 밖의 Outer Class와는 별개로 동작하므로 객체 생성이 가능하다.
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	}
}
