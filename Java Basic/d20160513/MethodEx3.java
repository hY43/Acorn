package d20160513;

// MethodEx3 Class Start.
public class MethodEx3 {
	// static [return�����ڷ���] [MethodName] ([�ڷ���] [������], [�ڷ���] [������]...){}
	// void: �� Method�� ������ �Ŀ� �ƹ� �͵� ��ȯ���� �� ��.(Return �� ����)
	
	// add Method Start. ( int )
	static int add(int a, int b) // �Ű������� ���� ������, �ش� Method������ ���ǹǷ� �̸��� �� Method������ �����ϸ� �ȴ�.
	{
		System.out.println("============= add Method ���� ���� �� =============");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// ���� ó���ϰ� ���� Main Method�� ������ �� �ִ�.
		return (a+b);
	}
	// add Method End.
	
	// add Method Start. ( float )
		static float add(float a, int b)
		{
			System.out.println("============= add Method ���� ���� �� =============");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			
			// ���� ó���ϰ� ���� Main Method�� ������ �� �ִ�.
			return (a+b);
		}
		// add Method End.
	
	// minus Method Start.
	static int minus(int a, int b)
	{
		System.out.println("============= minus Method ���� ���� �� =============");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// ���� ó���ϰ� ���� Main Method�� ������ �� �ִ�.
		return (a-b);
	}
	// minus Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		// Method ȣ�� ��, Method ��� �Ű� ���� ����, Ÿ��, ������ ��ġ�ؾ� �Ѵ�.
		int k = add(100,200);
		System.out.println("k: " + k);

		int n = minus(300,100);
		System.out.println("n: " + n );
		
		float f = add(102.2f, 500);
		System.out.println("f: " + f );
	}
	// Main Method End.
}
//MethodEx3 Class End.