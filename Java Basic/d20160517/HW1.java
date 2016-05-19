package d20160517;

public class HW1 {
	public static void main(String[] args) {
		Medic me1 = new Medic();
		마린 m1 = new 마린();
		시즈탱크 s1 = new 시즈탱크();
		시즈탱크 s2 = new 시즈탱크();
		
		// HW1, 마린이 메딕을 공격할 수 있도록 코드 작성.
		System.out.println("공격 전 me1의 상태");
		me1.상태정보();
		m1.공격(me1);
		System.out.println("공격 후 me1의 상태");
		me1.상태정보();

		// HW2, 시즈 탱크 객체를 생성하고 이 탱크가 마린과 시즈 탱크를 공격할 수 있도록 클래스를 작성하세요.
		s1.공격(m1);
		
		System.out.println("공격 전 s1의 상태");
		s2.상태정보();
		s1.공격(s2);
		System.out.println("공격 후 s1의 상태");
		s2.상태정보();
	}
}
