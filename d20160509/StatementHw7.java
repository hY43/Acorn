package d20160509;
import java.util.Scanner; // ����ڷ� ���� �����͸� �Է� �ޱ� ���� Library import

// Quiz, �Է� ���� �����ܸ� ����ϱ�.

// StatementHw7 Class Start
public class StatementHw7 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in); // ����ڷκ��� �Է� ���� ���� �����ϱ� ���� Scanner ��ü sc ����.
		int value = sc.nextInt(); // �Է� ���� ���� int Type ���� value ���� ��, �ʱ�ȭ.
		
		for(int i=1;i<=9;i++) // ������ ����� ���� �ݺ���(i�� 1~9 ��ȭ.)
			System.out.println(value + " * " + i + " = " + (value*i));
			// �Է� ���� ���� ���� ������ �ΰ� �׿� ���� �������� ����ϱ� ���� ��ȭ�ϴ� i�� ���Ͽ� ���.
	}
	// Main Method End
}
//StatementHw7 Class End