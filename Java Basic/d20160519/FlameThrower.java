package d20160519;

public class FlameThrower implements Weapon {
	int ����;
	
	FlameThrower()
	{
		���� = 100;
	}
	
	@Override
	public void use() {
		if(���� > 10)
		{
			System.out.println("�ҺҺҺҺҺ�");
			���� -= 10;
		}
		else
			System.out.println("ġ��");
	}

	@Override
	public void reuse() {
		System.out.println("���� ������..");
		this.���� = 100;
	}

	@Override
	public void drop() {
		
	}
	
}
