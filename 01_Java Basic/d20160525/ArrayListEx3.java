package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		// String ��ü�� ���� �� �ִ� ���� ArrayList
		// ���׸�: �Ϲ�ȭ.
		ArrayList<String> list = new ArrayList();
		list.add("����");
		int a =30;
		Integer it = a;
		// list.add(it); // Integer Type�̹Ƿ� String ArrayList���� ���� �� ����.
		list.add("����");
		
		System.out.println(list);
		// ArrayList �ȿ� �ִ� �� ������ ����ϱ�
		for(int i=0;i<list.size();i++)
		{
			String str = list.get(i);
			System.out.println(str.substring(0, 1));
		}
		
	}
}
