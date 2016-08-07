package d20160524;
// Inner Class
// 1. Member Inner Class: 내부의 멤버 변수와 같은 취급이기 때문에 Private한 변수까지도 접근이 가능하다. 
// 2. Static Inner Class
// 3. Local Inner Class
// 4. Anonymous Inner Class
public class OuterClassEx1 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;
	// 중첩
	class MemberInnerClass{
		// Class 가 마치 하나의 Member 변수 처럼 사용되기 때문에 Member Inner Class라고 한다.
		int d = 30;
		// static int e = 40; 
		// OuterClass에서 볼때 MemberInnerClass는 멤버 변수로 취급되기 때문에
		// Instance화 해야 memberInnerClass도 사용 가능
		// 그러므로 MemberInnerClass 내부에는 static 변수를 사용할 수 없다.
		static final int f = 40;
		public void print()
		{
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
			System.out.println("d: " + d);
			// System.out.println("e: " + e);
			System.out.println("f: " + f);
		}
	} 
	public static void main(String[] args) {
		OuterClassEx1 oce1 = new OuterClassEx1();
		System.out.println(oce1.a); // new 없이는 접근 불가능.
		System.out.println(OuterClassEx1.b); // new 없이 접근 가능.
		OuterClassEx1.MemberInnerClass mic = oce1.new MemberInnerClass();
		// Instance화할 때도 OuterClassEx1의 객체를 통해서 접근해야 한다.
		mic.print(); // 객체 생성되면 이후의 접근은 일반적인 객체와 동일하다.
	}
}
