package d20160524;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println(rnd.nextInt()); // int ���� ���� ���� ��ȯ.
		for(int i = 0;i<100;i++)
		{
			int k = rnd.nextInt(45); // 0~45������ �� ��ȯ
			System.out.println("K: " + k + " ");
		}
	}
}