package d20160509;
import java.util.Scanner; // Scanner ��ü�� ����� ���� Library import

// StatementEx5 Class Start
public class StatementEx5 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("�� �Է�: ");
		// ���� �Է� �޴� ��ĳ�� �����
		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʷ� ���� ���� �Է� �ޱ�
		int value = sc.nextInt();
		// �Է� ���� �� ���
		System.out.println(value);
		if(value > 100){ // ���� �б⹮.
			System.out.println("�Էµ� ���� 100���� ũ��."); // if �� ���ǹ��� �����Ѵٸ�(value>100) "�Էµ� ���� 100���� ũ��." ���ڿ� ���.
		}else{
			System.out.println("�Էµ� ���� 100���� �۴�."); // if �� ���ǹ��� �������� �ʴ´ٸ�(value<=100) "�Էµ� ���� 100���� �۴�." ���ڿ� ���
		}
	}
	// Main Method End
}
//StatementEx5 Class End