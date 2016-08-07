package d20160516;

// CarTest Class Start.
public class CarTest {
	// Car Class를 Test하기 위한 Test Class
	// Main Method Start.
	public static void main(String[] args)
	{
		Car c; // Car Class의 객체 c 생성
		c = new Car(); // Heap 영역에 Car 객체를 생성한 후, 참조 값을 c에 대입.
		// Car c = new Car(); 와 같이 작성해도 상관 없다.
		Car c2 = new Car();
		
		// c
		System.out.println("c의 참조 값: " + c);
		c.전진(); // 객체 c의 전진 Method 호출.
		System.out.println(c.바퀴);
		c.차량명 = "아반떼";
		c.바퀴 = 4;
		c.핸들 = 1;
		
		System.out.println("c의 차량명: " + c.차량명);
		System.out.println("c2의 바퀴 개수: " + c.바퀴);
		System.out.println("c2의 핸들 개수: " + c.핸들);
		
		System.out.println("=============================");
		
		// c2의 엔진은 몇개?
		System.out.println("c2의 엔진 수는 "+ c2.엔진 + "입니다."); // 별도의 초기화를 하지 않았기 때문에 int의 기본 값인 0으로 초기화 된다.
		c2.차량명 = "소나타";
		c2.바퀴 = 4;
		c2.핸들 = 1;

		System.out.println("c2의 차량명: " + c2.차량명);
		System.out.println("c2의 바퀴 개수: " + c2.바퀴);
		System.out.println("c2의 핸들 개수: " + c2.핸들);
	}
	// Main Method End.
}
// CarTest Class End.