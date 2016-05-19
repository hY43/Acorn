package d20160516;

// PersonTest Class Start.
public class PersonTest1 {
	// Person Class에 대한 Test를 위한 Class.
	// Main Method Start.
	public static void main(String[] args)
	{
		// Person 객체 생성.
		// [클래스명] [참조변수 명] = new 생성자();
		// 생성자: 객체의 초기화를 목적으로 멤버 변수의 초기 값을 지정해주는 특별한 능력이 있는 메서드.
		// 클래스 명과 동일한 이름을 갖고 있는 Method
		// 객체 생성 시 1회만 실행되는 Method
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		// Person 객체 초기화.
		p1.나이 = 19;
		p1.성별 = "여";
		p1.이름 = "송은주";
		p1.혈액형 = "B";
		p1.키 = 180.0f;
		p1.몸무게 = 41.0f;
		p1.눈 = 2;
		p1.다리 = 2;
		p1.머리 = 1;
		p1.입 = 1;
		p1.코 = 1;
		p1.팔 = 2;
		
		p2.나이 = 20;
		p2.성별 = "남";
		p2.이름 = "최철민";
		p2.혈액형 = "B";
		p2.키 = 180.0f;
		p2.몸무게 = 70.0f;
		p2.눈 = 2;
		p2.다리 = 2;
		p2.머리 = 1;
		p2.입 = 1;
		p2.코 = 1;
		p2.팔 = 2;
		// Q, 위의 초기화를 좀더 쉽게 할 수 있는 방법은 없을까??
		// A, 기본적으로 만족하는 값들을 Templete을 생성해두고 초기화 시키면 더 편하지 않을까?
		
		// 객체 요소 출력.
		System.out.println(p3.이름); // Templete으로 입력한 기본 값이 출력되는 것을 확인할 수 있다.
	}
	// Main Method End.
}
// PersonTest Class End.