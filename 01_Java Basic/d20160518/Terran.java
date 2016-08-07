package d20160518;

//추상화 : 시즈탱크, 마린, 메딕 세 클래스의 공통된 요소를 뽑아서 상위의 개념을 만드는것
public class Terran {

	int hp, x, y, 공격속도;
	int 이동속도, 방어력, 사정거리;
	int 단가;

	void 이동() {
		System.out.println("ㄱㄱㄱ");
	}

	void 패트롤() {
		System.out.println("와리가리");
	}

	void 홀드() {
		System.out.println("얼어라~~~");
	}

	void 상태정보() {
		System.out.println("============================");
		System.out.println("체력: " + hp);
		System.out.println("공속: " + 공격속도);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}

}
