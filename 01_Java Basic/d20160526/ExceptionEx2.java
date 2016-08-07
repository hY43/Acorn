package d20160526;

import java.util.Random;

public class ExceptionEx2 {
	static int plus(String a, String b)
	{
		int m = 0;
		int n = 0;
		try{ // ����δ� try ���� ���� �ʴ� ���� ����.
			m = Integer.parseInt(a);
			n = Integer.parseInt(b);	
		}catch(NumberFormatException nfe){
			System.out.println("���� ������ �ƴմϴ�.");
		}catch(ArithmeticException ae){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(Exception e){
			System.out.println("���� ���� ����");
		}finally{
			System.out.println("���ܰ� �߻��ϴ� �߻����� �ʴ� �ݵ�� ����Ǵ� �ڵ�");
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
