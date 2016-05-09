package d20160509;

// 1
// 3
// 6
// 10
// 15

// StatementHw4 Class Start
public class StatementHw4 {
	// Main Method Start
	public static void main(String[] args) {
/*
		System.out.println(1); // 0+1
		System.out.println(3); // 0+1+2
		System.out.println(6); // 0+1+2+3
		System.out.println(10); // 0+1+2+3+4
		System.out.println(15); // 0+1+2+3+4+5				
*/ 		// 시나리오 작성을 위한 결과 값 단순 출력.
		int sum = 0; // 누적 값을 저장하기 위해, int Type의 변수 sum 선언 후, 0으로 초기화.

		for (int i = 1; i <= 5; i++) { // 주어진 Line 수만큼 출력하기위한 반복문.
			sum += i; // 값 누적.
			System.out.println(sum); // 누적된 값 출력
		}		
	}
	// Main Method End
}
//StatementHw4 Class End