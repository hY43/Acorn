package d20160513;

// MethodEx2 Class Start.
public class MethodEx2 {
	// printGuGuDan Method���� ���� �����ϴ� int Type ���� dan�� �Ű�����, �Ķ����, ����, �μ� ������ �θ���.
	// printGuGuDan Method Start.
	static void printGuGuDan(int dan) // �������� ����ϴ� Method
	{
		System.out.println("���� ���� ��: " + dan);
		for(int i=1;i<=9;i++)
			System.out.println(dan+ " * " + i + " = " + (dan*i));
	}
	// printGuGuDan Method End.
	
	// gauss Method Start.
	static void gauss(int val)
	{
		int sum = 0;
		for(int i=1;i<=val;i++)
			sum += i;
		System.out.println("1���� " + val + "������ ���� " + sum + "�Դϴ�.");
	}
	// gauss Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		printGuGuDan(3);
		
		gauss(100);
		// 1���� 100������ ���� 5050�Դϴ�.
		
		gauss(1000);
		// 1���� 1000������ ���� 500500�Դϴ�.
	}
	// Main Method End.
}
//MethodEx2 Class Start.