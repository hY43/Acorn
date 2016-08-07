package d20160518;

public class SuperManTest {
	public static void main(String[] args)
	{
		SuperMan sp1 = new SuperMan();
		sp1.비행();
		// SuperMan Class는 Person Class의 상속을 받기 때문에 부모 Class의 Method 역시 사용 가능.
		sp1.먹기(); 
		System.out.println(sp1.getName());
	}
}
