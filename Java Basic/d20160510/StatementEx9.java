package d20160510;

public class StatementEx9 {
	public static void main(String[] args)
	{
		// �л��� ������ ����� ���
		int kor = 55;
		int eng = 90;
		int mat = 70;
		
		// ������ ����� ���
		int total = kor + eng + mat; // ������ ���� kor, eng, mat�� ���� ���Ͽ� int Type ���� total�� ����.
		float avg = total/3; // total ���� ���� ���� 3���� ������ ����� ����ϴµ� ����� �Ҽ����� �����ϱ� ������ float Type ���� avg�� �����Ѵ�.
		
		System.out.println("���� : " + total);
		System.out.println("���� : " + avg);
		// �̶� ����� 60�̻��̸� �հ� �ƴϸ� ���հ� �޼��� ���.
		
		if(avg >= 60) // �б� ������ ��� 60�̻��� �����ϸ� �հ��� �Ҹ����ϸ� ���հ��� ����ϵ��� �ϴ� �б⹮.
			System.out.println("�հ�");
		else
			System.out.println("���հ�");
	}
}
