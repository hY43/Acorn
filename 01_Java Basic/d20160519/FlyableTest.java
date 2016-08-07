package d20160519;

public class FlyableTest {
	public static void main(String[] args)
	{
		말 h1 = new 말();
		말 h2 = new 말();
		말 h3 = new 말();
		말 h4 = new 말();
		말 h5 = new 말();
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		마린 m3 = new 마린();
		마린 m4 = new 마린();
		
		Flyable[] f = {m1, m2, m3, m4, h1, h2, h3, h4, h5 };
		// Flyable Interface는 직접 instance화는 할 수 없으나 
		// 마린과 말은 Flyable Interface의 자식 Class이므로 참조 변수로서 위와 같이 받을 수 있다. 
		for(Flyable fy: f)
			fy.비행();		
	}
}
