package d20160526;

import java.util.Random;

public class ExceptionEx3 {
	// 예외 전가: 이 메소드를 사용하려면...사용하는 놈이 예외 처리하는 코드를 짜.
	// 사용자가 자기 상황에 맞게 예외를 처리할 수 있도록 발생 가능한 에러만 알려줌.(예외 유보)
	static int plus(String a, String b) throws NumberFormatException
	{
		int m = 0;
		int n = 0;
		m = Integer.parseInt(a);
		n = Integer.parseInt(b);	
		
		return m+n;
	}
	
	public static void main(String[] args) {
		String a1 = "100";
		String b1 = "X";
		try{
			System.out.println(plus(a1,b1));	
		}catch(NumberFormatException nfe){
			System.out.println("메롱");
		}
		
		
		System.out.println("------------------------------------");
		
		String a2 = "200";
		String b2 = "100";
		
		System.out.println(plus(a2,b2));
	}
}
