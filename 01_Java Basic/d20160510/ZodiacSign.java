package d20160510;

import java.util.Scanner;

// ZodiacSign Class Start.
public class ZodiacSign {
	// Main Method Start.
	public static void main(String[] args) {
		// �¾ �⵵�� �Է� �޾� � �������� ����ϴ� �ڵ� �ۼ�.
		System.out.println("�⵵ �Է�(4�ڸ�): ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// System.out.println(2016/12); // 0 -> �����̰� 0
		// �� �� �� �� �� �� �� �� �� �� �� ��
		// 4 5 6 7 8 9 10 11 0 1 2 3

		switch (year % 12) // �� �쿡 �ش��ϴ� ���� ã�� �츦 ����ϱ� ���� switch ��.
		{
		case 4:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 5:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 6:
			System.out.println("����� ȣ���� ���Դϴ�.");
			break;
		case 7:
			System.out.println("����� �䳢 ���Դϴ�.");
			break;
		case 8:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 9:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 10:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 11:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 0:
			System.out.println("����� ������ ���Դϴ�.");
			break;
		case 1:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 2:
			System.out.println("����� �� ���Դϴ�.");
			break;
		case 3:
			System.out.println("����� ���� ���Դϴ�.");
			break;
		}
	}
	// Main Method End.
}
// ZodiacSign Class End.