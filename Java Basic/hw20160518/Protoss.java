package hw20160518;

public class Protoss {
	/* Member Variable */
	int hp;
	int mp;
	int shield;
	float aSpeed;
	float mSpeed;
	int def;
	int atk;
	int reqMoney;
	boolean hFlag;	
	/* Constructor */

	/* Member Method */
	public void attack(Protoss p){
		if(p.hFlag == true)
			System.out.println("�ȸ¾Ҿ�");
		else
			p.hp -= atk;
	}
	public void move(){
		System.out.println("������");
	}
	public void uInfo()
	{
		System.out.println("=== ���� ���� ===");
		System.out.println("ü��: " + hp);
		System.out.println("���ݷ�: " + atk);
	}
}
