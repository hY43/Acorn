package d20160525;

public class GenericTest {
	public static void main(String[] args) {
		String[] str = {"�츮", "����", "����"};
		// �� �迭�� ��� ������ �ϴ� GenEx1 Class�� ����.
		GenEx1 ge1 = new GenEx1();
		ge1.setArray(str);
		// ���
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
		// �Ϲ�ȭ�� GenEx1�� Integer��� �ڷ����� ����Ͽ� ����ϰ� �ȴ�.
		Integer[] m2 = {20,10,40,20,30};
		GenEx1<Integer> ia2 = new GenEx1<Integer>();
		ia2.setArray(m2);
		ia2.print();
	}
}
