package d20160509;
// 5 ���� ������: ��Ʈ ������
// and => &, or => |
//OperEx5 Class Start
public class OperEx5 {
	// Main Method Start
	public static void main(String[] args)
	{
		byte a = 10; // 0000 1010
		byte b = 22; // 0001 0110
		System.out.println("a & b :  " + (a&b)); // a&b : 0000 0010 // &�� �Ѵ� ���϶� ���̴�.
		System.out.println("a | b :  " + (a|b)); // a|b : 0001 1110 // |�� �ϳ��� ���̸� ���̴�.
		
		boolean b1 = true; // boolean Type���� b1 ������ ������ ��, boolean Type�� ����� true ����.
		boolean b2 = false; // boolean Type���� b2 ������ ������ ��, boolean Type�� ����� false ����.
		
		// boolean Type�� �������� �����̱� ������ ��Ʈ ������ ��� ���� true Ȥ�� false�� ���.
		System.out.println("b1 & b2 :  " + (b1&b2)); // �Ѵ� true �϶� true ���.
		System.out.println("b1 | b2 :  " + (b1|b2)); // ���� �ϳ��� true��� true ���
	}
	// Main Method End
}
// OperEx5 Class End