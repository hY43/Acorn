package hw20160518;

public class Phone {
	/* Member Variable */
	int button;
	boolean screen;
	String pNumber;
	
	/* Constructor */
	Phone()
	{
		button = 12;
		screen = true;
	}
	/* Member Method */
	void 전화걸기()
	{
		System.out.println("전화걸기");
	}
	void 전화받기()
	{
		System.out.println("전화받기");
	}
	void 문자하기()
	{
		System.out.println("Hello");
	}
	void 사진찍기()
	{
		System.out.println("찰칵");
	}
	void 게임하기()
	{
		System.out.println("쾅쾅");
	}
}
