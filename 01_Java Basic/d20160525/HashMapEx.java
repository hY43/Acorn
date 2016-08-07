package d20160525;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("반장", "송은주");
		hm.put("부반장", "사라진그사람");
		hm.put("실", "바늘");
		hm.put("치킨", "맥주");
		hm.put("치킨", "소콜");
		hm.put("파전", "막걸리");
		hm.put("감자튀김", "맥주");
		// key는 중복 값을 허용하지 않기 때문에 가장 마지막 value만이 남는다.
		// Value는 중복되어도 상관이 없다.
		System.out.println(hm);
		String data = hm.get("파전");
		System.out.println(data);
		
		// 키 얻어오기
		Set<String> key = hm.keySet();
		// iterator 값 꺼내기
		Iterator<String> it = key.iterator();
		
		while(it.hasNext())
		{
			String value = it.next();
			System.out.println(value + "=" + hm.get(value));
		}
	}
}
