package d20160510;
import java.util.Scanner;

// Quiz, ȭ�� ��ȯ��
// �Է�: 67429
// 5����: 1��
// 1����: 1��
// 5õ��: 1��
// 1õ��: 2��
// 5���: 0��
// 1���: 4��
// 5�ʿ�: 0��
// 1�ʿ�: 2��
// 1�� : 9��

// StatementHw14 Class Start.
public class StatementHw14 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.println("�Է�: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // ������� �Է� ���� int Type ���� money�� ���� ��, ����.
		
		int fMan = money/50000; // 50000�� ���� ���.
		int oMan = (money%50000)/10000; // 10000�� ���� ���.
		int fChun = ((money%50000)%10000)/5000; // 5000�� ���� ���.
		int oChun = (((money%50000)%10000)%5000)/1000; // 1000�� ���� ���.
		int fBaek = ((((money%50000)%10000)%5000)%1000)/500; // 500�� ���� ���.
		int oBaek = (((((money%50000)%10000)%5000)%1000)%500)/100; // 100�� ���� ���.
		int fShip = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50; // 50�� ���� ���.
		int oShip = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10; // 10�� ���� ���.
		int oWon = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10; // 1�� ���� ���.
		
		// ��� ���.
		System.out.println("5����: "+ fMan + "��");
		System.out.println("1����: "+ oMan + "��");
		System.out.println("5õ��: "+ fChun + "��");
		System.out.println("1õ��: "+ oChun + "��");
		System.out.println("5���: "+ fBaek + "��");
		System.out.println("1���: "+ oBaek + "��");
		System.out.println("5�ʿ�: "+ fShip + "��");
		System.out.println("1�ʿ�: "+ oShip + "��");
		System.out.println("1��: "+ oWon + "��");
	}
	// Main Method End.
}
//StatementHw14 Class End.