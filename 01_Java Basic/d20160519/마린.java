package d20160519;

public class 마린 extends Terran implements Flyable{

	// 멤버변수,전역변수
	int 공격력;
	boolean isSteamPack;

	public 마린() {
		hp = 200;
		x = 0;
		y = 0;
		공격력 = 50;
		방어력 = 30;
		단가 = 50;
	}

	public 마린(int hp) {
		this.hp = hp;
		this.x = 0;
		y = 0;
		공격력 = 50;
		방어력 = 30;
		단가 = 50;
	}

	void 공격(Terran st) {
		System.out.println("마린 매개변수가 있는 메소드");
		System.out.println("st : " + st);
		st.hp -= 공격력;
		System.out.println("두두두두두");
	}
	
	void 스팀팩() {
		if (isSteamPack == false && hp > 5) {
			isSteamPack = true;
			System.out.println("뿅~~~~");
			공격력 += 3;
			공격속도 += 3;
			hp -= 5;
		}
	}

	@Override
	public void 비행() {
		System.out.println("날아라 마린!!");
		
	}
}
