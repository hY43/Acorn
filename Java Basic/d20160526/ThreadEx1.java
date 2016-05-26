package d20160526;
// Thread: 프로세스 내에서 실행되는 흐름의 단위
// Multi-Task, Multi-Thread 지원
// 1. Thread Class 상속
//	1) 상속
//	2) run() Override (동시에 진행하고자 하는 동작을 run Method에 넣는다)
//	3) start() 호출
// 2. Runnable Interface 구현
//	why) 만약 윈도우 창과 멀티 스레드를 동시에 써야한다면 JFrame과 Thread Class를 동시 상속 받아야하는데 Java는 다중 상속을 허용하지 않기 때문에 이러한 방법을 사용한다.

public class ThreadEx1 extends Thread{
	public ThreadEx1(String name)
	{
		// super(); // 부모 생성자를 호출
		// 부모 String 매개변수를 갖는 생성자를 호출
		super(name); // 현재 쓰레드에 이름을 부여.
	}
	@Override
	public void run() {
		// 동시에 처리하고자 하는 로직 작성
		// 현재 실행 중인 쓰레드의 이름.
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i=1;i<=100;i++)
		{
			System.out.println(name + " : " + i + "미터 달리는 중");
		} // for end
	}// run end

	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1("천둥이");
		ThreadEx1 th2 = new ThreadEx1("번개");
		System.out.println("준비~~");
		System.out.println("시~~~");
		System.out.println("작~~~");
		
		th1.start();
		th2.start();
		System.out.println("짝짝짝 축하합니다."); // Thread가 끝나지 않아도 Main은 별개 Main Thread이기 때문에 본인 코드만 실행하고 종료해버리고 남은 Thread만 독자적으로 돌아간다.
	}
}
