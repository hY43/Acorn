package kr.co.test.app;

public class MonsterBall implements Weapon{

	@Override
	public void use() {
		throwBall();
	}

	@Override
	public void drop() {
		System.out.println("풀어줬다");
	}

	@Override
	public void reuse() {
		System.out.println("줍줍");
	}
	
	public void throwBall(){
		System.out.println("잡았다!!!");
	}
}
