package d20160518;

public class SuperMan extends Person{
	/* Member Variable */
	int ����;
	int ���뽺;
	int ������Ƽ;
	
	/* Constructor */
	SuperMan()
	{
		// �θ�� ���� �������� ������ �ʱ�ȭ �ؾ� �Ѵ�. -> �θ��� �⺻ �����ڸ� �̿��Ͽ� �ʱ�ȭ �Ѵ�.
		super("Ŭ��ũ", "�ܰ���", "�Ź�����", 20);
		this.���� = 1;
		this.���뽺 = 1;
		this.������Ƽ = 1;
		System.out.println("SuperMan�� �⺻ ������");
	}
	/* Member Method */
	public void ����()
	{
		System.out.println("��~");
	}
	public void ���������()
	{
		System.out.println("����~");
	}

}
