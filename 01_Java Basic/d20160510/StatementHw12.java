package d20160510;
import java.io.IOException; // ������� �����͸� �Է¹޴� �Լ�, System.in.read()�� ����ϱ� ���� Library import
// Quiz, �Էµ� ���ڸ� ��� ��ȯ ��Ű���� �Ѵ�.
// StatementHw12 Class Start.
public class StatementHw12 {
	// Main Method Start.
	public static void main(String[] args) throws IOException
	{
		System.out.print("�Է�:");
		int value = System.in.read(); // ����ڰ� �Է��� ������ �ƽ�Ű �ڵ带 int Type�� ���� value�� ����.
		
		if(value >= 65 && value <= 90) // A~Z�� �ƽ�Ű �ڵ� ���� ���� ����ִ��� Ȯ��.(+32)
			System.out.println("�빮�� " + (char)value + "�� �ҹ��ڴ� " + (char)(value+32) + "�Դϴ�.");
		else if(value >= 97 && value <= 122) // a~z�� �ƽ�Ű �ڵ� ���� ���� ����ִ��� Ȯ��.(-32)
			System.out.println("�ҹ��� " + (char)value + "�� �빮�ڴ� " + (char)(value-32) + "�Դϴ�.");
		else
			System.out.println("�߸��� �Է� ���Դϴ�.");
	}
	// Main Method End.
}
//StatementHw12 Class End.