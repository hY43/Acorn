package d20160504;

// VarEx3 Class Start
public class VarEx3 {
	// Main Method Start
	public static void main(String[] args)
	{
		// ������ ���� �ǽ�.
		byte b1 = 10; // byte Type�� ���� b1�� ������ ��, ������ ��� 10�� ����.
		byte b2 = 20; // byte Type�� ���� b2�� ������ ��, ������ ��� 20�� ����.
		short sh1 = 30; // short Type�� ���� sh1�� ������ ��, ������ ��� 30�� ����.
		
		int i = b1 + b2; // byte Type�� ������ int ���� ����� ���� �ڷ����̱� ������ int ������ ����ȯ ��, ��� ������ ����.
						 // ������ ��� ������ int ���� ���־�� ��.
		
		System.out.println("i: " + i); // int�� ���� i�� ���� ���.
		
		int sh2 = sh1 + b2; // short Type ���� int ������ ����� ���� ������, int �� ������ ����� ����.
		
		System.out.println("sh2: " + sh2); // int �� ���� sh2�� ���� ���.
		
		int a = 200; // int Type�� ���� a�� ������ ��, ������ ��� 200 ����.
		long c = 300L; // long Type�� ���� c�� ������ ��, ������ ��� 300 ����. �� long type�� �����ϴ� ���̹Ƿ� ��� ���� "L"�� �ٿ� �� ��ȯ.
		
		long d = a+c; // long Type�� ���� d�� ������ ��, ������ ��� ���� ����� ����. 
		System.out.println("d: " + d); // long Type�� ���� d�� ���� ���.
		
		// �Ǽ��� ���� �ǽ�
		
		float f1 = 300f; // float Type�� ���� f1�� ������ ��, �Ǽ��� ��� 300.2�� ����.
		double d1 = 3090.20; // double Type�� ���� d1�� ������ ��, �Ǽ��� ��� 3090.20�� ����.
						     // ��, double ����� ��� ���� "d"�� �ٿ��� �ϳ� �����ϸ� �ڵ����� double Type�̶�� �ν�. 
		double k1 = f1 + d1; // double Type�� ���� k1�� ������ ��, ������ ���� ����� ����.
		System.out.println("k1: " + k1); // double Type�� ���� k1�� ���� ���.
	}
	// Main Method End
}
// VarEx3 Class End