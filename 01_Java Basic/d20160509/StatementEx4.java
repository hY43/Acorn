package d20160509;
import java.io.IOException; // System.in.read()�� ����ϱ� ���� ���̺귯�� import

// StatementEx4 Class Start
public class StatementEx4 {
	// Main Method Start
	public static void main(String[] args) throws IOException
	{
		// �ܺη� ���� ���� �Է� �ޱ�.
		System.out.println("�Է¹ޱ�");
		// ����ڷκ��� �ѱ��ڸ� �Է¹޾� ASCII �ڵ�� ����
		int value = System.in.read(); // ����� ������ �Է� �ޱ� ���� System.in.read() ���
		value -= 48; // �Է� ���� ������ �ƽ�Ű �ڵ尡 ��µǱ� ������ 48�� ���� �Է��� ���ڰ� ���.
		System.out.println("value: " + value); // �Էµ� ���� ���
		
		// ����ڰ� �Է��� ������ ���
		for(int i=1;i<10;i++) // 1~9������ ���� �Է¹��� ���� ���� �������� ����ϴµ�, �̶� ����� ���� i�� ���� for ��.
		{
			System.out.println(value + " * " + i + " = " + (value*i));	
			// ex) 3*1=3 �� ���� �������� �������� ����ϱ� ���� ��¹�.
		}
	}
	// Main Method End
}
//StatementEx4 Class End