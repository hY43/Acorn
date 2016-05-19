package d20160516;

public class 원숭이Test {
	public static void main(String[] args)
	{
		원숭이 m1 = new 원숭이();
		System.out.println(m1.성별);
		System.out.println(m1.나이);
		
		System.out.println("=============================");
		원숭이 m2 = new 원숭이(20, "암컷", "안경원숭이");
		System.out.println(m2.성별);
		System.out.println(m2.나이);
		System.out.println(m2.종류);
		
	}
}
