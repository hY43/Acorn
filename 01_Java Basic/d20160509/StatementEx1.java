package d20160509;
// 특정 목적에 의해 문장의 흐름을 변경 시키는 문장: 제어문
// 반복문 : for 문
// for(초기식; 조건식; 증감식)
// StatementEx1 Class Start
public class StatementEx1 {
	// Main Method Start
	public static void main(String[] args) {
		// 구구단 3단 출력
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 * "+ i + "=" + (3*i));
			// 3과 1~9까지 증가하는 i의 값을 순차적으로 곱해서 구구단 3단을 출력한다.
		} // 반복 횟수가 정확할 때 주로 사용되는 반복문.
	}
	// Main Method End
}
//StatementEx1 Class End