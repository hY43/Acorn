package d20160518;

public class Child extends Parent{
	/* Member Variable */
	int ���ڱ�����;
	String SNSid;
	
	/* Constructor */
	Child()
	{
		SNSid = "Ǫ������";
		System.out.println("Child Ŭ������ �⺻ ������");
	}
	/* Member Method */
	public void Ŭ������()
	{
		System.out.println("�㸸 �߷��Ծ��");
	}
	public void �б�����()
	{
		System.out.println("�б� ���� �Ⱦ��");
	}
	@Override
	public void �뷡�θ���() // Method Overriding
	{
		System.out.println("Ah choo");
	}
}
