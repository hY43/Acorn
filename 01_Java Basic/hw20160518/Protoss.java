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
			System.out.println("안맞았어");
		else
			p.hp -= atk;
	}
	public void move(){
		System.out.println("ㅌㅌㅌ");
	}
	public void uInfo()
	{
		System.out.println("=== 유닛 정보 ===");
		System.out.println("체력: " + hp);
		System.out.println("공격력: " + atk);
	}
}
