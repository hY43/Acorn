package d20160510;
import java.util.Scanner; // ����ڷ� ���� ���� �Է� �ޱ� ���� Library import.
// Quiz, ��ȯ�ϰ��� �ϴ� �ʸ� �Է�: 54321
// [���]
// 15�ð� 5�� 21��

// StatementHw13 Class Start.
public class StatementHw13 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.print("��ȯ�ϰ��� �ϴ� �ʸ� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // Scanner ��ü�� �̿��Ͽ� ����ڷ� ���� ���� �Է� �ް� �� ���� int Type�� ���� input�� ����.
		
		System.out.println("[���]");
		int hours = input/3600; // 60*60 = 3600��, �ѽð��� 3600���̹Ƿ� 3600�ʷ� ������ �ð� ���� ����.
		int minutes = (input%3600)/60; // �ð� ���� ���� �������� ������ ������ �� ���� ����.
		int seconds = (input%3600)%60; // �ð� ���� ���� ���������� ���� ���ϰ� �� �������� ���̹Ƿ�, �� ���� ����.
		
		System.out.println("��ȯ�� �ð��� " + hours + "�ð� " + minutes + "�� " + seconds + "�� �Դϴ�."); // x�ð� x�� x�� ��� ���.
	}
	// Main Method End.
}
//StatementHw13 Class End.