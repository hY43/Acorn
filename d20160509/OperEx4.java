package d20160509;
// 4 ���� ������: �� ������
// >, <, >=, <=, ==, !=, <>
// OperEx4 Class Start
public class OperEx4 {
	// Main Method Start
	public static void main(String[] args)
	{
		int a = 100;
		int b = 20;
		System.out.println("a > b: " + a + b); // �տ� ���ڿ��� ���� �����߱� ������, 120�� �ƴ϶� 10020�� ���.
		System.out.println("a > b: " + (a > b)); // ���� a�� ���� ���� b�� ������ ũ�Ƿ� true�� ���.
		System.out.println("a < b: " + (a < b)); // ���� a�� ���� ���� b�� ������ ũ�Ƿ� false�� ���.
		System.out.println("a >= b: " + (a >= b)); // ���� a�� ���� ���� b�� ������ ũ�Ƿ� true�� ���.
		System.out.println("a <= b: " + (a <= b)); // ���� a�� ���� ���� b�� ������  ũ�Ƿ� false�� ���.
		System.out.println("a == b: " + (a == b)); // ���� a�� ���� ���� b�� ������ ũ�Ƿ� false�� ���.
		System.out.println("a != b: " + (a != b)); // ���� a�� ���� ���� b�� ������ ũ�Ƿ� true�� ���.
	}
	// Main Method End
}
// OperEx4 Class End