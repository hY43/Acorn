package d20160519;

public class SmartPhone {
	/* Member Variable */
	String os;
	String number;
	String ��Ż�;
	static String ������;
	String ��Ÿ�;
	int ���ɹ�ȣ;
	int �ø����ȣ;
	
	/* Constructor */
	SmartPhone(){}
	SmartPhone(String os, String number, String ��Ż�, String ������, String ��Ÿ�, int ���ɹ�ȣ, int �ø����ȣ)
	{
		this.os = os;
		this.number = number;
		this.��Ż� = ��Ż�;
		this.������ = ������;
		this.��Ÿ� = ��Ÿ�;
		this.���ɹ�ȣ = ���ɹ�ȣ;
		this.�ø����ȣ = �ø����ȣ;
	}
	/* Member Method */
	public void ��ȭ�ɱ�(String ��ȭ��ȣ)
	{
		System.out.println("------------------");
		System.out.println(��ȭ��ȣ + "�� ��ȭ�Ŵ� ��");
	}
	public void ��ȭ�ޱ�()
	{
		System.out.println("��ȭ ��������~");
	}
	public void game()
	{
		System.out.println("�����ϱ�");
	}
	public void getApp()
	{
		System.out.println("���� �ޱ�");
	}
}