package d20160519;

public class SmartPhoneTest {
	// public: 공용, 누구나 접근 가능한
	// static: instance 생성 없이도 접근 가능한
	// void: Return 값이 없는
	// main: 함수 명
	// String[] args: 매개 변수로 args라는 String 배열을 갖는다.
	public static void main(String[] args)
	{
		SmartPhone.제조사 = "LG";
		SmartPhone sp1 = new SmartPhone("Android", "010-1111-1111", "SKT", "Samsung", "LTE", 11111111, 11141111);
		SmartPhone sp2 = new SmartPhone("Android", "010-2222-2222", "KTF", "Samsung", "LTE", 22222222, 22242222);
		SmartPhone sp3 = new SmartPhone("Android", "010-3333-3333", "LG", "LG", "LTE", 33333333, 33343333);
		
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);
		System.out.println("-------------------");
		System.out.println("인수합병");
		
		sp1.제조사 = "소미";
		
		System.out.println(sp1.제조사);
		System.out.println(sp2.제조사);
		
		System.out.println(Math.random()); // random Method 역시 따로 객체를 생성하지 않고 Class 명으로 호출하였기 때문에 Static Method 이다.
	}
}
