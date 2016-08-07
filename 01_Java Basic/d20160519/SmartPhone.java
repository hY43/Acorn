package d20160519;

public class SmartPhone {
	/* Member Variable */
	String os;
	String number;
	String 통신사;
	static String 제조사;
	String 통신망;
	int 유심번호;
	int 시리얼번호;
	
	/* Constructor */
	SmartPhone(){}
	SmartPhone(String os, String number, String 통신사, String 제조사, String 통신망, int 유심번호, int 시리얼번호)
	{
		this.os = os;
		this.number = number;
		this.통신사 = 통신사;
		this.제조사 = 제조사;
		this.통신망 = 통신망;
		this.유심번호 = 유심번호;
		this.시리얼번호 = 시리얼번호;
	}
	/* Member Method */
	public void 전화걸기(String 전화번호)
	{
		System.out.println("------------------");
		System.out.println(전화번호 + "로 전화거는 중");
	}
	public void 전화받기()
	{
		System.out.println("전화 받으세요~");
	}
	public void game()
	{
		System.out.println("게임하기");
	}
	public void getApp()
	{
		System.out.println("어플 받기");
	}
}