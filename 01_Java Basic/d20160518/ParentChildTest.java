package d20160518;

public class ParentChildTest {
	public static void main(String[] args)
	{
		Parent p = new Parent();
		System.out.println("==========================");
		Child c = new Child();
		c.잔소리();
		c.클럽가기();
		// p.클럽가기(); // 부모 클래스는 자식 클래스의 존재를 알 수 없기 때문에 부모 클래스에서는 자식 클래스의 기능을 사용할 수 없다.
		c.노래부르기();
		/*
		p = c; // 상속관계이므로 서로의 참조 값을 주고 받을 수 있다.
		p.노래부르기(); // 자식 Class의 노래부르기 호출
		// p.클럽가기(); // 자신의 자료형(Parent)에는 없는 Method이기 때문에 호출할 수 없다.
		*/
		p = c;
		Child c2;
		c2 = (Child)p; // 객체 형 변환
		// 현재 p는 Child Type 참조 변수 c의 참조 값이 들어있기 때문에, 객체 형변환을 하게 되면 c2에 역시 대입이 가능하다.
		c2.클럽가기();
		
		Parent p2 = new Child(); // 가능하다.
		
		
	}
}
