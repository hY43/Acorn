package d20160526;

import java.util.Random;

public class ExceptionEx3 {
	// ���� ����: �� �޼ҵ带 ����Ϸ���...����ϴ� ���� ���� ó���ϴ� �ڵ带 ¥.
	// ����ڰ� �ڱ� ��Ȳ�� �°� ���ܸ� ó���� �� �ֵ��� �߻� ������ ������ �˷���.(���� ����)
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
			System.out.println("�޷�");
		}
		
		
		System.out.println("------------------------------------");
		
		String a2 = "200";
		String b2 = "100";
		
		System.out.println(plus(a2,b2));
	}
}
