package d20160509;

// StatementEx2 Class Start
public class StatementEx2 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=0;i<=9;i++)
			System.out.println("*");
		// for���� ������ �����̶�� �߰�ȣ ���� ����.
		
		// �ݺ��� - while ��.
		int i = 1;// �ʱ��
		while(i<10){ // ���ǽ�
			System.out.println("3*"+i+"="+(i*3)); // �ʱ�Ŀ��� ����/�ʱ�ȭ�� i�� ���� ���� 3���� ���������� ���.
			i++; // ������
		}
		// While���� for������ �޸� �߰������� �������� �־��־�� �ϸ�, ����ڰ� �Է� ���� ������ �ִ� ��쿡 �ַ� ���Ǵ� �ݺ����̴�.
	}
	// Main Method End
}
//StatementEx2 Class End