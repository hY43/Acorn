package d20160510;
import java.io.IOException;

// StatementEx8 Class Start.
public class StatementEx8 {
	// Main Method Start.
	public static void main(String[] args) throws IOException
	{
		// �Էµ� ���� �빮������ �ҹ������� �������� �Ǻ�.
		System.out.print("�Է�: ");
		int value = System.in.read();// ����ں��� ���� �Է� ����.
									 // �Է� ���� ASCII Code ���� ������ int Type ���� value ���� ��, ����.
		
		// �б⹮: �Է� ���� ���� �빮������ �ҹ������� �������� �Ǻ�.(ASCII Code A:65, a:97, 0:48)
		if(value >= 65 && value <= 90) // A~Z �� �ƽ�Ű�ڵ� ������ �����ϴ��� Ȯ���ϴ� �б⹮.
			System.out.println((char)value + "�� �빮�� �Դϴ�.");
		else if(value >= 97 && value <= 122) // a~z �� �ƽ�Ű�ڵ� ������ �����ϴ��� Ȯ���ϴ� �б⹮.
			System.out.println((char)value + "�� �ҹ��� �Դϴ�.");
		else if(value >= 48 && value <= 57) // 0~9 �� �ƽ�Ű�ڵ� ������ �����ϴ��� Ȯ���ϴ� �б⹮.
			System.out.println((char)value + "�� ���� �Դϴ�.");
		else // �빮��, �ҹ���, ������ �ƽ�Ű�ڵ� ������ �ƹ� �͵� �������� �ʾ������� ����Ǵ� else��.
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
	}
	// Main Method End.
}
//StatementEx8 Class End.