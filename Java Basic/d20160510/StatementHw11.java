package d20160510;
import java.util.Scanner; // Scanner ��ü ����� ���� Library import.

// Quiz, �Էµ� ���� 3�� ������� �ƴ��� �Ǻ�.
// StatementHw1 Class Start.
public class StatementHw11 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ���� �Է� ����.
		int num = sc.nextInt(); // �Է� ���� ���� int Type ���� num�� ����.
		
		if(num%3 == 0) // �б⹮�� ���� %3�� ���� 0�̸� 3�� ���, �ƴϸ� 3�� ����� �ƴ��� ���.
			System.out.println(num + "�� 3�� ����̴�."); // �б⹮�� ���� ���� ��, ���.
		else // if ���� ������ �������� ���� ������ ����.
			System.out.println(num + "�� 3�� ����� �ƴϴ�."); // �б⹮�� ���� �Ҹ��� ��, ���.
	}
	// Main Method End.
}
//StatementHw1 Class End.