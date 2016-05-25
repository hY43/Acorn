package d20160524;
// Inner Class
// 1. Member Inner Class: ������ ��� ������ ���� ����̱� ������ Private�� ���������� ������ �����ϴ�. 
// 2. Static Inner Class
// 3. Local Inner Class
// 4. Anonymous Inner Class
public class OuterClassEx1 {
	private int a = 10;
	static int b = 20;
	static final int c = 40;
	// ��ø
	class MemberInnerClass{
		// Class �� ��ġ �ϳ��� Member ���� ó�� ���Ǳ� ������ Member Inner Class��� �Ѵ�.
		int d = 30;
		// static int e = 40; 
		// OuterClass���� ���� MemberInnerClass�� ��� ������ ��޵Ǳ� ������
		// Instanceȭ �ؾ� memberInnerClass�� ��� ����
		// �׷��Ƿ� MemberInnerClass ���ο��� static ������ ����� �� ����.
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
		System.out.println(oce1.a); // new ���̴� ���� �Ұ���.
		System.out.println(OuterClassEx1.b); // new ���� ���� ����.
		OuterClassEx1.MemberInnerClass mic = oce1.new MemberInnerClass();
		// Instanceȭ�� ���� OuterClassEx1�� ��ü�� ���ؼ� �����ؾ� �Ѵ�.
		mic.print(); // ��ü �����Ǹ� ������ ������ �Ϲ����� ��ü�� �����ϴ�.
	}
}
