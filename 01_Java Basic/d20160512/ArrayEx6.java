package d20160512;

// ArrayEx6 Class Start.
public class ArrayEx6 {
	// Main Method Start.
	public static void main(String[] args) {
		int[] a = new int[3]; // int Type 변수 3개를 갖는 배열 선언.
		int[] b = {3,9,2};
		System.out.println("a: " + a); // a 참조 값.

		// 배열의 크기.
		System.out.println("길이: " + a.length); // length 변수를 사용한 배열 a의 길이 출력.

		// 배열의 각 요소에 값 담기.
		// 배열 요소 출력
		// 반복문 사용해서 출력
		for(int i=0;i<a.length;i++) // length 변수를 이용한 a 요소 출력.
									// length 변수를 이용하면 잘못된 인덱스로 접근하는 일을 방지할 수 있다.
		{
			a[i] = (i+1)*10;
			System.out.println(a[i]);
		}
	}
	// Main Method End.
}
// ArrayEx6 Class End.