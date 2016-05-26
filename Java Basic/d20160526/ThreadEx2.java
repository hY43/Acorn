package d20160526;

// 1. Runnable Interface implements
// 2. run() Override
// 3. Thread Class의 생성자, Runnable 타입의 매개 변수를 받는 것을 사용.
// 4. Thread Class의 start() 호출.

public class ThreadEx2 implements Runnable{
	String name;
	public ThreadEx2(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		{
			System.out.println(name + ": " + i + "미터 달리는 중");
		}
	}
	public static void main(String[] args) {
		ThreadEx2 te1 = new ThreadEx2("천둥이");
		ThreadEx2 te2 = new ThreadEx2("번개");
		
		Thread th1 = new Thread(te1);
		Thread th2 = new Thread(te2);
		
		th1.start();
		th2.start();
		
	}
}
