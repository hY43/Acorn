package d20160512;
import java.util.Scanner; // ����ڷκ��� �����͸� �Է¹ޱ� ���� Library Import.

// MethodEx1 Class Start.
public class MethodEx1 {
	// Method: ���� ����ϴ� �ڵ尡 �ִٸ� �� �ڵ忡 �̸��� ���̰�, �ʿ��� �� ȣ���Ͽ� ����Ѵ�.

	// prtStar Method Start.
	static void prtStar() // �Է� ���� ���� �̿��Ͽ� *�� ����ϴ� Method.
	{
		System.out.print("����: ");
		Scanner sc = new Scanner(System.in); // ����ڷ� ���� �����͸� �Է� �ޱ� ���� �͹̳� ����.
		int val = sc.nextInt(); // ����ڷκ��� �����͸� �Է� �޾�, int Type ���� val�� ����.
		
		for(int i=1;i<=val;i++) // N Line�� ����ϱ� ���� for��.
		{
			for(int j=0;j<i;j++) // ���� "*" ���ڸ� ��� ���� for ��.
				System.out.print("*"); // "*" ���� ���.
			System.out.println(); // ����.
		} // for end.
	}
	// prtStar Method End.
	
	// prtHello Method Start.
	static void prtHello() // "�ȳ� �ڹ�" ���ڿ��� ����ϴ� Method
	{
		System.out.println("�ȳ� �ڹ�");
	}
	// prtHello Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{	
		prtStar();
		prtHello(); // "�ȳ� �ڹ�" �޼��� ���.
	}
	// Main Method End.
}
// MethodEx1 Class End.