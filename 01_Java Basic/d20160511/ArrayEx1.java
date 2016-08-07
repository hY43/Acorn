package d20160511;

// ArrayEx1 Class Start.
public class ArrayEx1 {
	// Array(배열): apt 변수
	// 동일한 사이즈에 연속된 공간에 할당되는 변수.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		// int a; // 일반 변수, int Type(Size)의 변수 선언.
		// int a[]; // 배열 선언.
		int[] a;
		a = new int[3]; // int Type의 변수 3개를 갖는 배열 선언.
		// a[X] 에서 X를 첨자 혹은 인덱스라고 부른다.
		
		a[0] = 10; // 배열의 첫번째 요소에 int Type의 상수 10 대입.
		a[1] = 20; // 배열의 두번째 요소에 int Type의 상수 20 대입.
		a[2] = 30; // 배열의 세번째 요소에 int Type의 상수 30 대입.
		
		// 배열의 각 요소 출력.
		System.out.println("a[0]: " + a[0]);
		System.out.println("a[1]: " + a[1]);
		System.out.println("a[2]: " + a[2]);
		

		// ------------------------------------------------------
		// int 크기이고 요소가 10개인 배열 변수 b를 선언하고, 각 변수에 10,20,30,40,50,60,70,80,90,100을 대입하고 출력하시오.
		int[] b = new int[10]; // int 크기의 10개의 요소를 갖는 배열 b 선언.
		int value = 10; // 배열 요소 값 초기화.
		
		for(int i=0;i<10;i++) // b 배열의 값을 대입하기 위한 for문.
			b[i] = (i+1)*10; // 배열의 각 요소 대입. 10 20 30 40 ... 100
		
		for(int i=0;i<10;i++) // b 배열의 각 요소를 출력하기 위한 for문.
			System.out.println("b["+i+"]: " + b[i] ); // 각 요소 출력.
		
		// System.out.println(b[10]); // Runtime Error!! 실행하는 도중에 Error가 발생한다.
									  // b[10], 즉 배열의 마지막 요소에는 접근할 수 없다.
	}
	// Main Method End.
}
// ArrayEx1 Class End.