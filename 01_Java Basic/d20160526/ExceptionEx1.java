package d20160526;

import java.util.Random;

public class ExceptionEx1 {
	public static void main(String[] args) {
		// 1. Error: ġ���� ����
		// 2. Exception: ������ ����
		//	1) try ~ catch: case by case ����
		//	2) ���� ����.
		// �����ϰ� 0���� 10������ �� ���
		Random rnd = new Random();
		int a = 100;
		// ���� �߻��� ����Ǵ� ������ try ��ġ
		// catch ���� Exception�� ������ ����(�ڽ�) ������ ���� ���� ����.
		try{
			for(int i=0;i<100;i++){
				int b = rnd.nextInt(10);
				System.out.println("a/b: " + (a/b));
				System.out.println("������");
			}
		}catch(ArithmeticException ae){
			System.out.println("0���� ���� ���� �����ϴ�.");
		}catch(Exception e){
			System.out.println("���� ���� ����");
			e.getStackTrace();
			// ���ݱ��� stack Memory ����
		}
	}
}
