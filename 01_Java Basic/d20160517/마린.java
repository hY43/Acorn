package d20160517;

// ���� Class Start.
public class ���� {
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
	boolean isSteamPack;
	
	// Default Constructor.
	public ����(){
		// ������
		// 1. Class ��� ����.
		// 2. ����: ��� ������ �ʱ�ȭ.
		// 3. ���� �� x, void x
		// 4. Ŭ���� �� ==> ù���� �빮��, ������ �� ==> ù���� �빮��.
		hp = 100; 
		x = 252;
		y = 466;
		���ݷ� = 14;
		���ݼӵ� = 140;
		�ܰ� = 34;
		���� = 10;
		�����Ÿ� = 50;
		�̵��ӵ� = 15;
	}
	
	public ����(int hp) // Constructor Overloading.
	{
		this.hp = hp; // ���� ������ ����Ű�� this keyword�� �̿��Ͽ� ������ ���� ���� ���� hp�� �ƴ� ���� ���� hp�� ���� ���� �Ű� ���� ���� �����Ѵ�.
		// this: �ڱ� �ڽ��� ����Ű�� ���� ����.
		// �ٸ� �Ӽ� ���� �״�� �ΰ� hp�� �ٸ� ������ �ϰ��� �Ѵ�.
		
		// �� ������ ������ ���� this�� �� �پ��ִ� ���� �����̳�, ���� ���� ���� ��� ȥ���� ���� �ʴ� ��쿡�� this�� �����ص� �����ϴ�.
		x = 252;
		y = 466;
		���ݷ� = 14;
		���ݼӵ� = 140;
		�ܰ� = 34;
		���� = 10;
		�����Ÿ� = 50;
		�̵��ӵ� = 15;
		
		// ���� ���� ������� �� �����ڸ��� �����ָ� ���� ���ŷӴ�.
		// ������ �⺻ �����ڸ� ȣ���Ͽ�(this()) ��ü�� �ʱ�ȭ ��Ű��, �����ϰ��� �ϴ� ���� ���� �ʱ�ȭ ��Ű�� ���� ����.
	}
	// Member Method.
	void ����()
	{
		System.out.println("���� �Ű� ������ ���� method");
		System.out.println("�εεεεεεε�");
	}

	void ����(���� m)// ���� ����� �������� ���� �� ���� ���� Method
	{
		System.out.println("���� �Ű� ������ �ִ� method");
		System.out.println("m: " + m);
		m.hp -= this.���ݷ�;
		System.out.println("�εεεεεεε�");
	}
	
	void ����(Medic m)// ���� ����� �޵����� ������ ���� ���� Method
	{
		System.out.println("�޵� �Ű� ������ �ִ� method");
		System.out.println("m: " + m);
		m.HP -= this.���ݷ�;
		System.out.println("�εεεεεεε�");
	}

	
	void �̵�(){System.out.println("����");}
	void ��Ʈ��(){System.out.println("�͸�����");}
	void ������()
	{
		if (isSteamPack == false && hp >= 5) 
		{
			System.out.println("��");
			���ݷ� += 3;
			���ݼӵ� += 3;
			hp -= 5;
			isSteamPack = true;
		}
	}
	void Ȧ��(){System.out.println("����");}
	void ��������()
	{
		System.out.println("====================");
		System.out.println("ü��: " + hp);
		System.out.println("���ݷ�: " + ���ݷ�);
		System.out.println("���ݼӵ�: " + ���ݼӵ�);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
// ���� Class End.