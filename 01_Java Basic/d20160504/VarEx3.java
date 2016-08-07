package d20160504;

// VarEx3 Class Start
public class VarEx3 {
	// Main Method Start
	public static void main(String[] args)
	{
		// 정수형 변수 실습.
		byte b1 = 10; // byte Type의 변수 b1을 선언한 후, 정수형 상수 10을 대입.
		byte b2 = 20; // byte Type의 변수 b2를 선언한 후, 정수형 상수 20을 대입.
		short sh1 = 30; // short Type의 변수 sh1을 선언한 후, 정수형 상수 30을 대입.
		
		int i = b1 + b2; // byte Type의 변수는 int 이하 사이즈를 갖는 자료형이기 때문에 int 형으로 형변환 후, 산술 연산을 진행.
						 // 때문에 결과 저장을 int 형에 해주어야 함.
		
		System.out.println("i: " + i); // int형 변수 i의 내용 출력.
		
		int sh2 = sh1 + b2; // short Type 역시 int 이하의 사이즈를 갖기 때문에, int 형 변수에 결과를 저장.
		
		System.out.println("sh2: " + sh2); // int 형 변수 sh2의 내용 출력.
		
		int a = 200; // int Type의 변수 a를 선언한 후, 정수형 상수 200 대입.
		long c = 300L; // long Type의 변수 c를 성언한 후, 정수형 상수 300 대입. 단 long type에 대입하는 것이므로 상수 끝에 "L"을 붙여 형 변환.
		
		long d = a+c; // long Type의 변수 d를 선언한 후, 우항의 산술 연산 결과를 저장. 
		System.out.println("d: " + d); // long Type의 변수 d의 내용 출력.
		
		// 실수형 변수 실습
		
		float f1 = 300f; // float Type의 변수 f1를 선언한 후, 실수형 상수 300.2를 대입.
		double d1 = 3090.20; // double Type의 변수 d1을 선언한 후, 실수형 상수 3090.20을 대입.
						     // 단, double 상수는 상수 끝에 "d"를 붙여야 하나 생략하면 자동으로 double Type이라고 인식. 
		double k1 = f1 + d1; // double Type의 변수 k1을 선언한 후, 우항의 연산 결과를 대입.
		System.out.println("k1: " + k1); // double Type의 변수 k1의 내용 출력.
	}
	// Main Method End
}
// VarEx3 Class End