package d20160517;

public class ������ũ {
	// Member variable, Global variable.
	int hp;
	int x;
	int y;
	int ���ݷ�;
	int ���ݼӵ�;
	int �̵��ӵ�;
	int ����;
	int �����Ÿ�;
	int �ܰ�;

	// Default Constructor.
	������ũ() {
		hp = 300;
		x = 0;
		y = 0;
		���ݷ� = 30;
		���ݼӵ� = 50;
		�ܰ� = 68;
		���� = 100;
		�����Ÿ� = 80;
		�̵��ӵ� = 20;
	}

	void ����(���� m)
	{
		System.out.println("���� ����!!");
		m.hp -= this.���ݷ�;
	}
	
	void ����(������ũ s)
	{
		System.out.println("��ũ ����!!");
		s.hp -= s.���ݷ�;
	}
	
	void ��������()
	{
		System.out.println("====================");
		System.out.println("ü��: " + hp);
	}
}
