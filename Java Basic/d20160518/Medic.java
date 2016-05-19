package d20160518;

public class Medic extends Terran {
	String 성별, 이름;
	int mp;
	boolean isHeal;

	Medic() {
		이름 = "모랄레스";
		공격속도 = 3;
		성별 = "여";
		이동속도 = 4;
		x = 0;
		y = 0;
	}

	Medic(int HP, int MP, int 사거리) {
		this();
		this.사정거리 = 사거리;
	}

	Medic(int HP, int MP, int 사거리, String 이름) {
		this(HP, MP, 사거리);
		this.이름 = 이름;
	}

	void 힐(Terran te) {
		if (mp > 10) {
			mp -= 10;
			System.out.println("치료중입니다.");
		} else {
			System.out.println("마나가..부족해..");
		}

	}

}
