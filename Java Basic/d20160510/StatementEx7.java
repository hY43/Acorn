package d20160510;
import java.util.Scanner; // Scanner ��ü�� ����ϱ� ���� Library import.

// StatementEx7 Class Start.
public class StatementEx7 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// System.out: �����, System.in: Ű����
		// ������� �Է� ���� �޾Ƽ� �� ���� Ȧ������ ¦������ �Ǻ�.
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ���� �Է� ����.
		int num = sc.nextInt(); // �Է� ���� int Type ���� num�� ����.
		if((num%2) == 0) // �б⹮�� �̿��ؼ�, %2�� ����� 0�̸� ¦��, 0�� �ƴϸ� Ȧ��.
			System.out.println(num + "�� ¦�� �Դϴ�."); // �б⹮�� ���� ������, ���.
		else // if ���� ������ �Ҹ����ÿ��� ����Ǵ� else.
			System.out.println(num + "�� Ȧ�� �Դϴ�."); // �б⹮�� ���� �Ҹ�����, ���.
	}
	// Main Method End.
}
//StatementEx7 Class End.