package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("�Ե�");
		hs.add("����");
		hs.add("���ӳø�");
		hs.add("�ø�");
		hs.add("���");
		// No duplicated Element : ó���� ���� �����ְ� �ߺ� ���� ���� �ʴ´�.
		hs.add("����");
		hs.add("����");
		hs.add("����");
		
		System.out.println("hs: " + hs);
		
		// Ȱ���
		Iterator<String> it = hs.iterator();

		while(it.hasNext()) // it�� ���� �׸��� ���� �������� �ݺ�.
		{
			//if(it.next().equals("����"))
			{
				String data = it.next();
				System.out.println(data);
			}
		}
		
	}
}
