package d20160509;
import java.util.Scanner; // �����͸� �Է� �ޱ� ���� Scanner ��ü�� ���� �޾ƾ��ϴµ�, �̸� ���� Library Import.

// Quiz, ���� �Է� �޾� ���� ����ϴ� �ڵ� �ϼ�

// StatementHw10 Class Start
public class StatementHw10 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("���� �Է�:"); // "���� �Է�: " ���ڿ� ���.
		Scanner sc = new Scanner(System.in); // �����͸� �Է� �ޱ� ���� sc ��ü ���� ��, �Է� �� ����.
		int val = sc.nextInt(); // int Type�� ������ �����ϰ� �Է� ���� ����Ͽ� �ʱ�ȭ.  
		
		if(val >= 90) // �Է� ���� 90 �̻��̸�, "A ����" ���ڿ� ���.
			System.out.println("A ����");
		else if(val>=80) // �Է� ���� 90 �̸�, 80 �̻��̶��, "B ����" ���ڿ� ���.
			System.out.println("B ����");
		else if(val>=70) // �Է� ���� 80 �̸�, 70 �̻��̶��, "C ����" ���ڿ� ���.
			System.out.println("C ����");
		else if(val>=60) // �Է� ���� 70  �̸�, 60 �̻��̶��, "D ����" ���ڿ� ���.
			System.out.println("D ����");
		else // �Է� ���� 60 �̸��̶��, "F ����" ���ڿ� ���.
			System.out.println("F ����");
	}
	// Main Method End
}
//StatementHw10 Class Start