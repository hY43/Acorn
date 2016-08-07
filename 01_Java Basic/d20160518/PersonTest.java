package d20160518;

public class PersonTest {
	// Person Class를 Test하기 위한 Class.
	public static void main(String[] args)
	{
		Person p1 = new Person("홍길동", "남자", "도둑", 20);
		p1.personInfo();
		p1.먹기();
		p1.자기();
		p1.생각하기();
	}
}
