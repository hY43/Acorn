package d20160509;

// StatementHw5 Class Start
public class StatementHw5 {
	// Main Method Start
	public static void main(String[] args)
	{
		int sum = 0; // ���� ���� ��� ���� sum ����
		for(int i=1;i<101;i++) // 1~100�� ������ ���ϱ� ���� �ݺ���
			sum+=i; // �� �ݺ����� 1�� �����ϴ� i ���� �����־� 1+2+...+100 ������ ���� ����.
		
		// sum = (1+100)*50; // ���콺�� �ع�
		System.out.println("1���� 100������ �������� "+ sum + "�Դϴ�."); // ������ sum �� ���.
	}
	// Main Method End
}
//StatementHw5 Class End