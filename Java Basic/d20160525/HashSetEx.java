package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("규동");
		hs.add("스시");
		hs.add("육쌈냉면");
		hs.add("냉면");
		hs.add("김밥");
		// No duplicated Element : 처음의 값만 남아있고 중복 값은 넣지 않는다.
		hs.add("스시");
		hs.add("스시");
		hs.add("스시");
		
		System.out.println("hs: " + hs);
		
		// 활용법
		Iterator<String> it = hs.iterator();

		while(it.hasNext()) // it의 다음 항목이 있을 때까지만 반복.
		{
			//if(it.next().equals("스시"))
			{
				String data = it.next();
				System.out.println(data);
			}
		}
		
	}
}
