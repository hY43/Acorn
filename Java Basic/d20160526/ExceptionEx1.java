package d20160526;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. Error: 치명적 오류
		// 2. Exception: 가벼운 오류
		//	1) try ~ catch: case by case 정의
		//	2) 예외 전가.
		// 랜덤하게 0부터 10사이의 값 얻기
		Random rnd = new Random();
		int a = 100;
		// 예외 발생이 예상되는 지점에 try 설치
		// catch 문의 Exception은 범위가 작은(자식) 순으로 쓰는 것이 좋다.
		try{
			for(int i=0;i<100;i++){
				int b = rnd.nextInt(10);
				System.out.println("a/b: " + (a/b));
				System.out.println("하하하");
			}
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌 수는 없습니다.");
		}catch(Exception e){
			System.out.println("나도 몰라 예외");
			e.getStackTrace();
			// 지금까지 stack Memory 추적
		}
	}
}
