package d20160504;
// ������: �ڷ� ������ ���� ������ ������� ����ϰ� �� ����� ��� ������ �ǹ��ϴ� ��ȣ���� ��Ī.
// 1 ����: ���� ������.
// OperEx1 Class Start
public class OperEx1 {
	// Main Method Start
	public static void main(String[] args)
	{
		int a = 100;
		int b = 20;
		// a�� ���� ���� 1 ���� ��Ű�� �ʹ�.
		a = a + 1;
		
		System.out.println("a : " + a);
		
		// �����ڸ� �Ѱ��� �̿��Ͽ� a�� ���� 1 ���� ��Ű�� �ʹ�.
		a++; // a=a+1 ���� ������ ���� ���� ������ �ӵ��� ������.
		System.out.println("a : " + a);
		
		// a�� ���� ���� 1 ���� ��Ű�� �ʹ�.
		a--;
		System.out.println("a : " + a);
		
		b = a++; // ���� ++�� �� Line�� ����� �Ŀ� ���� ������ �ϱ� ������ ���� �����ϱ� ���� a���� b�� ����.
		         // ��, b = a; a = a+1; �� �ѹ��� �� ���̶�� �� �� �ִ�.
		System.out.println("a: " + a + ", b: " + b);
		
		int k = 20;
		int m = 10;
		
		k = m++;
		// k = 10, m = 11
		System.out.println("k: " + k + ", m: "+ m);
	}
	// Main Method End
}
// OperEx1 Class End