package d20160524;

import java.util.Random;

public class UtilEx1 {
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println(rnd.nextInt()); // int 범위 내의 정수 반환.
		for(int i = 0;i<100;i++)
		{
			int k = rnd.nextInt(45);
			System.out.println("K: " + k + " ");
		}
	}
}
