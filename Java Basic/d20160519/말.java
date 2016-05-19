package d20160519;

public class 말 extends 포유류 implements Flyable{
	int 꼬리;
	String 색상;
	
	public void 달리기()
	{
		System.out.println("말~ 달리자~");
	}
	
	// Source - Override Implement Methods 기능을 사용하면 꼭 Override해서 구현해야하는 Method를 보여준다.
	
	@Override
	public void 먹기()
	{
		System.out.println("사료 먹어요");
	}
	@Override
	public void 자기()
	{
		System.out.println("마굿간에서 자요");
	}

	@Override
	public void 비행() {
		System.out.println("날아라 말!!");
	}
}
