package d20160510;
// Quiz, 1���� 100���� ���� 2�� ����� 3�� ����� �ƴ� ���� ��Ƽ� ������ ���� ���.

// StatementHw17 Class Start.
public class StatementHw17 {
	// Main Method Start.
	public static void main(String[] args)
	{
		int sum = 0; // �� ������ ���� int Type ���� sum�� ������ ��, 0���� �ʱ�ȭ.
		
		for(int i=1;i<=100;i++)
		{
			if(i%2 != 0 && i%3 != 0) // 2�� ����� 3�� ����� �ƴ� ���� ã�� ���� �б⹮.
				sum+=i; // �б� ������ �����ϸ� �ش� i ���� sum�� �����Ѵ�.
		}
		
		System.out.println("2�� ����� 3�� ����� �ƴ� ������ ���� "+sum+"�Դϴ�.");
	}
	// Main Method End.
}
//StatementHw17 Class End.