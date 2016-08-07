package d20160519;

// 경찰은 총을 가지고 있다. 경찰 HAS A 총 => Member Variable로 해결.
// 사람은 포유류다. 사람 IS A 포유류 => 상속으로 처리
public class Police extends Gun{
	/* Member Variable */
	String 계급;
	String 이름;
	String 성별;
	String 근무지;
	int 나이;
	Weapon w; // HAS A 관계 해결.
	
	/* Constructor */
	public Police(){}
	public Police(Weapon w){
		// 무장 경찰
		// 생성자를 통해 입력 받는 w 객체가 총인지 화염방사기인지에 따라,
		// 아래에 호출하는 use와 reuse Method를 통해 실행되는 동작이 달라질 것이다.
		this.w = w;
	}
	public Police(String 계급, String 이름, String 성별, String 근무지, int 나이)
	{
		this.계급 = 계급;
		this.이름 = 이름;
		this.성별 = 성별;
		this.근무지 = 근무지;
		this.나이 = 나이;
	}
	
	/* Member Method */
	public void fire()
	{
		if(w!=null) // 입력 받은 w 객체가 null이 아니라면 w 객체의 Method use()를 호출하라.
			w.use();
	}
	public void reload()
	{
		if(w!=null) // 입력 받은 w 객체가 null이 아니라면 w 객체의 Method reuse()를 호출하라.
			w.reuse();
	}
	public void 체포()
	{
		System.out.println("당신은 묵비권을 행사할 수 있으며......");
	}
	public void 음주단속()
	{
		System.out.println("부세요");
	}
	public void 순찰()
	{
		System.out.println("왔다갔다");
	}
	public void 수사()
	{
		System.out.println("수사중");
	}
}
