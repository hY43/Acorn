package d20160518;

public class Parent {
	/* Member Variable */
	int 나이;
	String 이름;
	String 성별;
	String 성격;
	String 직업;
	int 자산;
	
	/* Constructor */
	Parent()
	{
		나이 = 50;
		이름 = "홍길동";
		성별 = "남";
		성격 = "까칠";
		직업 = "양산군자";
		자산 = 2000000000;
		System.out.println("Parent의 기본 생성자");
	}
	Parent(int 나이, String 이름, String 성별)
	{
		this();
		this.나이 = 나이;
		this.이름 = 이름;
		this.성별 = 성별;
		System.out.println("Parent의 매개 변수 있는 생성자");
	}
	
	/* Member Method */
	public void 먹기()
	{
		System.out.println("고기고기");
	}
	public void 자기()
	{
		System.out.println("쿨쿨");
	}
	public void 잔소리()
	{
		System.out.println("잔소리잔소리");
	}
	public void 노래부르기()
	{
		System.out.println("흥얼흥얼");
	}
	public void 요리하기()
	{
		System.out.println("요리요리");
	}
}
