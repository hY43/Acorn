package d20160509;
import java.io.IOException; // ����ڷ� ���� ���� �Է� �ޱ� ���� Method System.in.read ����� ���� Library import
// ����ڷκ��� �Է� ���� �ѹ��ڸ� ����ϱ�.

// StatementHw6 Class Start
public class StatementHw6
{
	// Main Method Start
	public static void main(String[] args)  throws IOException // System.in.read Method���� ������ ���ܸ� ó���ϱ� ���� throws �߰�.
	{
		System.out.print("�Է�:");
		System.out.println("����ڰ� �Է��� ���ڴ� "+(char)(System.in.read())+"�Դϴ�."); 
		// System.in.read�� ���� �Է� ���� ���� int Type���� ����Ǳ� ������, ���� �Է� �� ASCII Code ������ ��µȴ�.
		// �� ������ char Type���� ���� ����ȯ ���� ���ڷ� ����Ѵ�.
	}
	// Main Method End
}
//StatementHw6 Class End