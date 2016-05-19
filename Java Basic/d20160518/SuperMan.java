package d20160518;

public class SuperMan extends Person{
	/* Member Variable */
	int 망또;
	int 레깅스;
	int 빨간팬티;
	
	/* Constructor */
	SuperMan()
	{
		// 부모로 부터 물려받은 변수도 초기화 해야 한다. -> 부모의 기본 생성자를 이용하여 초기화 한다.
		super("클라크", "외계인", "신문기자", 20);
		this.망또 = 1;
		this.레깅스 = 1;
		this.빨간팬티 = 1;
		System.out.println("SuperMan의 기본 생성자");
	}
	/* Member Method */
	public void 비행()
	{
		System.out.println("슝~");
	}
	public void 레이저쏘기()
	{
		System.out.println("지잉~");
	}

}
