package d20160525;

public class GenericTest {
	public static void main(String[] args) {
		String[] str = {"우리", "나라", "만세"};
		// 이 배열을 멤버 변수로 하는 GenEx1 Class를 생성.
		GenEx1 ge1 = new GenEx1();
		ge1.setArray(str);
		// 출력
		ge1.print();
		
		System.out.println("------------------------------------");
		
		int[] m = {20,10,40,20,30};
		IntArray ia = new IntArray();
		ia.setArray(m);
		ia.print();
		
		System.out.println("------------------------------------");
		
		float[] f = {30.2f, 33.3f, 102.34f};
		FloatArray fa = new FloatArray(); 
		fa.setArray(f);
		fa.print();
		
		System.out.println("------------------------------------ Generic");
		// 일반화된 GenEx1에 Integer라는 자료형을 명시하여 사용하게 된다.
		Integer[] m2 = {20,10,40,20,30};
		GenEx1<Integer> ia2 = new GenEx1<Integer>();
		ia2.setArray(m2);
		ia2.print();
	}
}
