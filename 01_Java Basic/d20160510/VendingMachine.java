package d20160510;
import java.util.Scanner;
/*
1. ����ڷκ��� ���ڸ� �Է¹޴´�. 

	�������Է��ϼ��� : 50000

	1. �ݶ�       : 1200��
	2. ���̴�     : 2500��
	3. ����ź��� : 120��

2. �޴��� �����ϼ��� :  2
3. �? 3 
4. ���̴� 3�� 
   �ܵ� : 42500�Դϴ�. 
   ����   : 4��
   õ��   : 2��
   ����� : 1��
*/
// VendingMachine Class Start.
public class VendingMachine {
	// Main Method Start.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ���� �Է� �ޱ� ���� �͹̳� ����.
		System.out.print("������ �Է��ϼ���: ");
		int input = sc.nextInt(); // ����ڷκ��� �ӱݵ� ������ int Type�� ���� input�� ����.
		
		System.out.println("1. �ݶ�         : 1200��");
		System.out.println("2. ���̴�      : 2500��");
		System.out.println("3. ����ź���:  120��");
		System.out.print("�޴��� �����ϼ���: ");
		int selMenu = sc.nextInt(); // ����ڷκ��� �޴��� ���� ��ȣ�� �Է� �޾� selMenu ������ ����.
		System.out.print("������ �Է��ϼ���:  ");
		int count = sc.nextInt(); // ����ڷκ��� ������ �޴��� ���� ������ �Է� �޾� count ������ ����.
		
		switch(selMenu) // ����ڰ� ������ �޴��� ���� �ܱ��� ����ϴ� switch ��.
		{
		case 1:
			System.out.print("�ݶ� " + count + "��");
			input -= (1200*count);
			break;
		case 2:
			System.out.print("���̴� " + count + "��");
			input -= (2500*count);
			break;
		case 3:
			System.out.print("����ź��� " + count + "��");
			input -= (120*count);
			break;
		}
		System.out.println("�ܵ�: "+ input);
		System.out.println("����: "+ input/10000); // 10000���� ���� ���.
		System.out.println("õ��: "+ (input%10000)/1000); // 1000���� ���� ���.
		System.out.println("�����: "+ ((input%10000)%1000)/500); // 500���� ���� ���.
	}
	// Main Method End.
}
//VendingMachine Class End.