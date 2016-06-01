package d20160601;

public class OnlyOneTest {
	public static void main(String[] args) {
		OnlyOne one = OnlyOne.getInstance();
		OnlyOne two = OnlyOne.getInstance();
		
		System.out.println("one: " + one);
		System.out.println("two: " + two);
	}
}
