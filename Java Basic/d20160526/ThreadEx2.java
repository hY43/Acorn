package d20160526;

// 1. Runnable Interface implements
// 2. run() Override
// 3. Thread Class�� ������, Runnable Ÿ���� �Ű� ������ �޴� ���� ���.
// 4. Thread Class�� start() ȣ��.

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
			System.out.println(name + ": " + i + "���� �޸��� ��");
		}
	}
	public static void main(String[] args) {
		ThreadEx2 te1 = new ThreadEx2("õ����");
		ThreadEx2 te2 = new ThreadEx2("����");
		
		Thread th1 = new Thread(te1);
		Thread th2 = new Thread(te2);
		
		th1.start();
		th2.start();
		
	}
}
