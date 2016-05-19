package d20160516;

// PersonTest2 Class Start.
public class PersonTest2 {
	// Person Class를 Test하기 위한 Class.
	// Main Method Start.
	public static void main(String[] args)
	{
		Person p = new Person(); // 기본 생성자를 사용하여 Person 객체 p 생성.
		System.out.println(p.이름); // 기본 생성자로 초기화된 이름이 출력.
		// 생성자는 처음 객체를 생성할 때 딱 한번 호출된다.
		// 생성자를 통해 초기화 되는 변수에서 다른 부분만 새로 초기화.
		p.이름 = "송은주";
		p.나이 = 19;
		p.키 = 180.0f;
		p.몸무게 = 41.0f;

		System.out.println("============================");
		Person p2 = new Person(900, "요다");
		System.out.println(p2.나이);
		System.out.println(p2.이름);
		System.out.println(p2.성별);
		
	}
	// Main Method End.
}
// PersonTest2 Class End.