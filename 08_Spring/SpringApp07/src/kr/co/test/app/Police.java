package kr.co.test.app;

public class Police implements Character{
	Weapon w;
	int hp;
	
	// 생성자를 통해 참조값 전달
	public Police(Weapon w, int hp) {
		this.w = w;
		this.hp = hp;
	}

	@Override
	public void walk() {
		System.out.println("경찰이 아장아장 걸어요");
	}

	@Override
	public void eat(String it) {
		System.out.println(it + "을/를 맛있게 먹어요");
		
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj + "을/를 공격합니다.");
		w.use();
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj + "을/를 획득합니다.");
		
	}

}
