package d20160509;
import java.util.Scanner; // Scanner ��ü ����� ���� Library import

// StatementEx6 Class Start
public class StatementEx6 {
	// Main Method Start
	public static void main(String[] args)
	{
		// 1. ����ڷκ��� ������ �Է� �޴´�.
		//	1) System.out.read();
		//	2) Scanner
		System.out.print("�Է�: "); // "�Է�: " ���ڿ� ���.
		Scanner sc = new Scanner(System.in); // Scanner Class�� ��ü sc�� �����ϰ� �Է� ���� �޾� �ش� reference�� ����.
		int value = sc.nextInt(); // ��ü sc�� �̿��Ͽ� �Է� ���� ���� int �� ���� value�� �����ϰ� �̿� ����.
		// 2. �Էµ� �� ���.
		System.out.println("�Էµ� ���� " + value + "�Դϴ�.");
		// 3. �Էµ� ������ 90�� �̻��̸� A ���� ������ ����Ѵ�.
		if(value >= 90) // ���� �б⹮
			System.out.println("A ����"); // �б⹮ ����, value >= 90�� ���̶�� "A ����" ���ڿ� ���.
	}
	// Main Method End
}
//StatementEx6 Class End