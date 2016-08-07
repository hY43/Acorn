package d20160516;
// Hw1, int[] m = {200, 100, 300, 200, 400} 의 누적 합을 출력하세요
// 단, 향상된 for문을 사용.

// Hw1 Class Start.
public class Hw1 {
	public static void main(String[] args)
	{
		int[] m = {200, 100, 300, 200, 400};
		int sum = 0; // 값 누적을 위한 int Type 변수 sum 선언 후, 0으로 초기화.
		
		// 향상된 for문을 사용하여 배열의 각 요소에 대한 합계 누적.
		for(int x : m)
			sum += x; // 누적.
		System.out.println("누적 합은 " + sum + "입니다.");
	}
}
//Hw1 Class End.