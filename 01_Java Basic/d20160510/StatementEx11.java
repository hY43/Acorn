package d20160510;
import java.util.Scanner; // ����ڷκ��� ���� �Է� �ޱ� ���� ����� Class�� ���� Library import

// StatementEx11 Class Start.
public class StatementEx11 {
	// Main Method Start.
	public static void main(String[] args) {
		System.out.print("����� ������ �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ���� �Է� �ޱ� ���� �͹̳� ����.
		int score = sc.nextInt(); // ����ڷκ��� �Է� ���� ���� int Type ���� score�� ����.
		
		System.out.println("score: " + score);
		
		switch(score/10) // ������ 10������ ���������� ������ 10���� ���� ������ ����.
		{
		case 10:
		case 9: // ���� ���� 9 Ȥ�� 10�̶�� A���� ���.
			System.out.println("A����");
			break;
		case 8: // ���� ���� 8�̶�� B���� ���.
			System.out.println("B����");
			break;
		case 7: // ���� ���� 7�̶�� C���� ���.
			System.out.println("C����");
			break;
		case 6: // ���� ���� 6�̶�� D���� ���.
			System.out.println("D����");
			break;
		default: // ���� ���� 6�̸��̶�� F���� ���.
			System.out.println("F����");
			break;
		}
	}
	// Main Method End.
}
//StatementEx11 Class End.