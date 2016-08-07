package d20160519;

public class 고래 extends 포유류{
	/* Member Variable */
	int 지느러미;
	
	/* Constructor */
	고래()
	{
		지느러미 = 1;
	}
	
	/* Member Method */
	void 헤엄치기(){
		System.out.println("어푸어푸");
	}
	@Override
	public void 먹기(){
		System.out.println("새우를 먹어요");
	}
	@Override
	public void 자기(){
		System.out.println("물위에서 자요");
	}
}
