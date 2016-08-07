package d20160526;

import java.util.Random;

public class ExceptionEx2 {
	static int plus(String a, String b)
	{
		int m = 0;
		int n = 0;
		try{ // 선언부는 try 문에 넣지 않는 것이 좋다.
			m = Integer.parseInt(a);
			n = Integer.parseInt(b);	
		}catch(NumberFormatException nfe){
			System.out.println("숫자 형식이 아닙니다.");
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(Exception e){
			System.out.println("나도 몰라 예외");
		}finally{
			System.out.println("예외가 발생하던 발생하지 않던 반드시 실행되는 코드");
		}
		
		return m+n;
	}
	
	public static void main(String[] args) {
		String a1 = "100";
		String b1 = "X";
		
		System.out.println(plus(a1,b1));
		
		System.out.println("------------------------------------");
		
		String a2 = "200";
		String b2 = "100";
		
		System.out.println(plus(a2,b2));
	}
}
