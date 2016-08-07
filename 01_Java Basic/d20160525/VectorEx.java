package d20160525;

import java.util.Vector;

// Vector: ���� ������ Object �迭
public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector(); // �⺻ �����ڸ� �̿��� Vector ��ü v ����.
		System.out.println("v�� ���뷮: " + v.capacity()); // ���� v�� �⺻ �����ڷ� ������� ������ 10���� ��Ҹ� ���� �迭�� ����ȴ�.
		System.out.println("v�� ��� ��: "+ v.size()); // ���� Vector v�� ������� �ʾұ� ������ 0�� ���´�.

		// Vector v�� ��� �߰�
		v.add("����");
		v.add("������");
		v.add("���");
		v.add("����");
		v.add("��");
		
		System.out.println("v: " + v); // ���� Vector v�� ����ִ� ��� ���.
		System.out.println("v�� ��� ��: " + v.size()); // 5���� ��Ҹ� �߰��Ͽ����Ƿ� 5�� ���.
		
		// �ߺ� �� �߰�.
		v.add("����");
		v.add("������");
		v.add("���");
		v.add("����");
		v.add("��");
				
		System.out.println("v: " + v); // List Type�� Ư���� ������ �����Ƿ� �ߺ� ���ο� ���� ���� �Է��� �� �ִ�.
		System.out.println("v�� ��� ��: " + v.size()); // 5���� ��Ҹ� �߰��Ͽ����Ƿ� 10�� ��µȴ�.
		
		// v�� ���ġ�� �߰��ϵ��� ������ �Է�.
		v.add("����");
		v.add("����");
		v.add("����");
		
		System.out.println("v�� ��� ��: " + v.size()); // 5���� ��Ҹ� �߰��Ͽ����Ƿ� 13�� ��µȴ�.
		System.out.println("v�� ���뷮: " + v.capacity()); // v�� �⺻ ��뷮�� �ʰ��Ͽ��� ������ �⺻�� 10����ŭ ��뷮�� �����ȴ�.
		
		Object obj = v.get(0); // Vector v�� 0��° ��Ҹ� Object Type ���� obj�� ����.
							   // get()�� Object�� ��ȯ.
		System.out.println(obj); // ���� Object ������ �׳� ����ϸ� ���� ���� ���;������� ������ �Է��� ���� String ���� �̹Ƿ�
								 // �ڽ� Class�� toString�� ��µǾ� ���ڿ��� ��µȴ�.
		// String str = "����";
		// Object o = str;
		// add(o);
		// �� ���� ������� �Է��� �ڵ����� �̷������.
		Object obj2 = v.get(0);
		String str = (String)obj2; // Object Ÿ������ ��ȯ�� �Ǿ��⶧���� ���� ���ڿ� ������ ����ϱ� ���ؼ��� ��ü ����ȯ�� �ؾ� �Ѵ�.
		
		for(int i = 0;i<v.size();i++)
		{
			Object obj3 = v.get(i);
			String str2 = (String)obj3;
			System.out.println(str2);
		}
	}
}
