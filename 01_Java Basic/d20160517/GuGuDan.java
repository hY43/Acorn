package d20160517;

public class GuGuDan {
// �������� �� ���� ����ϴ� Class
	// Member Variable.
	int dan; // ���� �Է� �ޱ� ���� int Type ��� ���� dan ����.
	
	// constructor
	GuGuDan()
	{
		// ���� ���� �Է������� ������ 2�� �Է�.
		dan = 2;
	}
	
	GuGuDan(int dan)
	{
		// ���� �Է��ϸ� �ش� �� �Է�.
		this.dan = dan;
	}
	
	// Member Method.
	void print()
	{
		for(int i=1;i<=9;i++)
		{
			// System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			System.out.println(this.dan + " * " + i + " = " + (this.dan * i));
		}

	}
}
