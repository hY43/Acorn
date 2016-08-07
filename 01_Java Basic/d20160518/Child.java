package d20160518;

public class Child extends Parent{
	/* Member Variable */
	int 학자금융자;
	String SNSid;
	
	/* Constructor */
	Child()
	{
		SNSid = "푸하하하";
		System.out.println("Child 클래스의 기본 생성자");
	}
	/* Member Method */
	public void 클럽가기()
	{
		System.out.println("춤만 추러왔어요");
	}
	public void 학교가기()
	{
		System.out.println("학교 가기 싫어요");
	}
	@Override
	public void 노래부르기() // Method Overriding
	{
		System.out.println("Ah choo");
	}
}
