package d20160525;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // ArrayList ���� �� �ʱ�ȭ.
		al.add("����");
		al.add("�ٳ���");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("�ٳ���");
		al.add("����");
		al.add("����");
		// ������ �ֱ� ������ �ߺ��� ���� �͵� �Է��� �ȴ�.
		
		System.out.println("ArrayList: " + al);
		System.out.println(al.size()); // ���� ��� ��Ұ� �ԷµǾ����� Ȯ���ϱ� ���� size Method
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i)); // get Method�� �̿��� ��� Ȯ��.
	}
}
