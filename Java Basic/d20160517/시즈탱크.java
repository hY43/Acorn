package d20160517;

public class 시즈탱크 {
	// Member variable, Global variable.
	int hp;
	int x;
	int y;
	int 공격력;
	int 공격속도;
	int 이동속도;
	int 방어력;
	int 사정거리;
	int 단가;

	// Default Constructor.
	시즈탱크() {
		hp = 300;
		x = 0;
		y = 0;
		공격력 = 30;
		공격속도 = 50;
		단가 = 68;
		방어력 = 100;
		사정거리 = 80;
		이동속도 = 20;
	}

	void 공격(마린 m)
	{
		System.out.println("마린 공격!!");
		m.hp -= this.공격력;
	}
	
	void 공격(시즈탱크 s)
	{
		System.out.println("탱크 공격!!");
		s.hp -= s.공격력;
	}
	
	void 상태정보()
	{
		System.out.println("====================");
		System.out.println("체력: " + hp);
	}
}
