package d20160518;

public class Parent {
	/* Member Variable */
	int ����;
	String �̸�;
	String ����;
	String ����;
	String ����;
	int �ڻ�;
	
	/* Constructor */
	Parent()
	{
		���� = 50;
		�̸� = "ȫ�浿";
		���� = "��";
		���� = "��ĥ";
		���� = "��걺��";
		�ڻ� = 2000000000;
		System.out.println("Parent�� �⺻ ������");
	}
	Parent(int ����, String �̸�, String ����)
	{
		this();
		this.���� = ����;
		this.�̸� = �̸�;
		this.���� = ����;
		System.out.println("Parent�� �Ű� ���� �ִ� ������");
	}
	
	/* Member Method */
	public void �Ա�()
	{
		System.out.println("�����");
	}
	public void �ڱ�()
	{
		System.out.println("����");
	}
	public void �ܼҸ�()
	{
		System.out.println("�ܼҸ��ܼҸ�");
	}
	public void �뷡�θ���()
	{
		System.out.println("������");
	}
	public void �丮�ϱ�()
	{
		System.out.println("�丮�丮");
	}
}
