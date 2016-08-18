package kr.co.test.app;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionImple implements CollectionInter{
	private List<String> list;
	private Map<String, String> map;
	
	public CollectionImple(){}
	public CollectionImple(List<String> list, Map<String, String> map) {
		super();
		this.list = list;
		this.map = map;
	}

	public List<String> getList(){return list;}
	public void setList(List<String> list){this.list = list;}
	public Map<String, String> getMap(){return map;}
	public void setMap(Map<String, String> map){this.map = map;}
	@Override
	public void printList() {
		for(String x : list){
			System.out.println(x);
		}
		System.out.println("=======================");
	}

	@Override
	public void printMap() {
		/*	
		Set<String> key = map.keySet(); // key가 Set계열이기 때문에 중복 값을 허용한다.
		Iterator<String> it = key.iterator(); 
		while(it.hasNext()){
			String x = it.next();
			System.out.println(x + " : " + map.get(it.next()));
		}*/
		for(String key : map.keySet()){
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("=======================");
	}
}
