package d20160519;

public class 동물Test {
	public static void main(String[] args)
	{
		// 포유류 mu = new 포유류(); // 포유류는 추상 Class이므로 new keyword는 사용할 수 없다.
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 m = new 다람쥐();
		말 h = new 말();

		System.out.println("----------------------------");
		r.먹기();
		r.자기();
		r.점프();
		
		System.out.println("----------------------------");
		
		w.먹기();
		w.자기();
		w.헤엄치기();
		
		System.out.println("----------------------------");
		
		m.먹기();
		m.자기();
		m.나무에오르기();
		
		System.out.println("----------------------------");
		
		h.먹기();
		h.자기();
		h.달리기();
	}
}
