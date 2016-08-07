package d20160516;

// MethodEx8 Class Start.
public class MethodEx8 {
	/* *********************************************
	// add Method Start.(인자가 두 개인 add Method)
	static int add(int num1, int num2)
	{
		// 입력 받은 두 개의 정수를 합하여 결과를 리턴하는 Method.
		return num1 + num2; // 합을 리턴.
	}
	// add Method End.
	
	// add Method Start.(인자가 세 개인 add Method)
	static int add(int num1, int num2, int num3)
	{
		// 입력 받은 세 개의 정수를 합하여 결과를 리턴하는 Method.
		return num1 + num2 + num3;
	}
	// add Method End.
	*********************************************** */
	// 위의 add Method를 가변 인수를 사용하여, 매개 변수가 늘어날 때의 상황에 대비한다.
	static int add(int ... arrs)
	{
		int sum = 0; // 합의 누적을 위한 int Type 변수 sum 선언 및 0으로 초기화.
		for(int i=0;i<arrs.length;i++) // 매개 변수로 전달 받은 arrs 배열의 각 요소의 합을 구하는 for문.
			sum += arrs[i]; // 합계 누적.
		return sum; // 총 합계 반환.
	}
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		// Method는 그 이름만 보고 그 Method를 구분하는 것이 아니라, 인자의 갯수, 타입 등과 같은 Method Signature를 확인하여 구분한게 된다.
		int k = add(a,b); // int Type 변수 a와 b를 합을 구하는 Method인 add()에 전달하고, 그 결과를 k에 대입.
		int m = add(a,b,c);
		// Q, 매개 변수의 수가 바뀔때마다....Method를 계속 생성해주어야 하나?
		// A, 가변 인수를 사용하면 이러한 문제를 해결할 수 있다.
		
		System.out.println("k: "+ k); // 결과 출력.
		System.out.println("m: "+ m);
	}
	// Main Method End.
}
// MethodEx8 Class End.
