package d20160519;

// ������ ���� ������ �ִ�. ���� HAS A �� => Member Variable�� �ذ�.
// ����� ��������. ��� IS A ������ => ������� ó��
public class Police extends Gun{
	/* Member Variable */
	String ���;
	String �̸�;
	String ����;
	String �ٹ���;
	int ����;
	Weapon w; // HAS A ���� �ذ�.
	
	/* Constructor */
	public Police(){}
	public Police(Weapon w){
		// ���� ����
		this.w = w;
	}
	public Police(String ���, String �̸�, String ����, String �ٹ���, int ����)
	{
		this.��� = ���;
		this.�̸� = �̸�;
		this.���� = ����;
		this.�ٹ��� = �ٹ���;
		this.���� = ����;
	}
	
	/* Member Method */
	public void fire()
	{
		if(w!=null)
			w.use();
	}
	public void reload()
	{
		if(w!=null)
			w.reuse();
	}
	public void ü��()
	{
		System.out.println("����� ������� ����� �� ������......");
	}
	public void ���ִܼ�()
	{
		System.out.println("�μ���");
	}
	public void ����()
	{
		System.out.println("�Դٰ���");
	}
	public void ����()
	{
		System.out.println("������");
	}
}
