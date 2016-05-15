package d20160511;

// 배열: 동일한 크기를 갖는 연속된 공간에 할당된 변수
//	1. 접근속도의 향상.
//	2. 인덱스(첨자)를 이용한 반복문의 사용 가능.

// ******배열이 참조형 변수인 이유.
// int[] a = new int[5];
// 위의 코드를 입력하면 우선 Heap 영역에 int Type의 5개의 연속된 공간을 잡고(new) 해당 자료형의 기본 값으로 초기화 시킨다.
// 그 후, 대입연산자(=)를 통해 데이터가 담긴 Heap 영역의 주소를 변수 a에 대입하게 된다.
// 즉, 실제 값을 담는 Primitive Type 변수와는 달리, 주소 값을 담기 때문에 Reference Type 변수라고 한다. 

// ArrayEx2 Class Start.
public class ArrayEx2 {
	// Main Method Start.
	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		// 배열을 선언하면 그 각 변수에는 각 자료형의 기본 값이 들어있다.
		// Ex) int: 0, float: 0.0f, boolean: false(0)

		System.out.println("a: " + a); // a에는 실제 변수가 저장될 공간의 주소가 저장되어 있다.
		
		System.out.println("a 배열의 크기: "+ a.length); // length 변수를 이용하여 배열의 길이를 출력.
		for (int i = 0; i < a.length; i++) // 배열의 길이를 의미하는 length 변수를 이용하여 for문을 돌려 에러를 막는다.
			System.out.println("a[" + i + "]: " + a[i]);
	}
	// Main Method End.
}
// ArrayEx2 Class End.