package d20160516;

public class Person {
	int 머리, 팔, 다리, 눈, 코, 입; 
	String 이름, 혈액형, 성별;
	int 나이;
	float 키, 몸무게;
	
	Person(int x, String y)
	{
		// 생성자 역시 Method이므로 매개 변수를 가질 수 있다.
		System.out.println("매개 변수 있는 생성자");
		나이 = x;
		이름 = y;
	}
	Person() // Class name과 동일한 이름을 가짐.
	{
		// 멤버 변수의 값을 초기화할 목적.
		// 리턴할 필요가 없으며 void 역시 붙지 않는다.
		// 만약 따로 생성자를 만들어주지 않으면 JVM(Compiler)가 아래와 같은 기본 생성자를 추가하여 실행해준다.
		/*
		Person()
		{
			머리=0; 팔=0; 다리=0; 눈=0; 코=0; 입=0;
			이름=null; 혈액형=null; 성별=null;
			나이=0; 키=0.0f; 몸무게=0.0f
		}
		*/
		머리=1; 
		팔=2;
		다리=2; 
		눈=2; 
		코=1; 
		입=1; 
		이름="이브";
		혈액형 = "O";
		성별 = "여";
		나이 = 20;
		키 = 180.0f;
		몸무게 = 60.0f;
		System.out.println("기본 생성자 호출 됨");
	}
	void 먹기()
	{
		System.out.println("냠냠");
	}
	void 잔다()
	{
		System.out.println("쿨쿨");
	}
	void 생각한다()
	{
		System.out.println("생각 중");
	}
}
