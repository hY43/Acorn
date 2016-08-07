package d20160526;
// Thread: ���μ��� ������ ����Ǵ� �帧�� ����
// Multi-Task, Multi-Thread ����
// 1. Thread Class ���
//	1) ���
//	2) run() Override (���ÿ� �����ϰ��� �ϴ� ������ run Method�� �ִ´�)
//	3) start() ȣ��
// 2. Runnable Interface ����
//	why) ���� ������ â�� ��Ƽ �����带 ���ÿ� ����Ѵٸ� JFrame�� Thread Class�� ���� ��� �޾ƾ��ϴµ� Java�� ���� ����� ������� �ʱ� ������ �̷��� ����� ����Ѵ�.

public class ThreadEx1 extends Thread{
	public ThreadEx1(String name)
	{
		// super(); // �θ� �����ڸ� ȣ��
		// �θ� String �Ű������� ���� �����ڸ� ȣ��
		super(name); // ���� �����忡 �̸��� �ο�.
	}
	@Override
	public void run() {
		// ���ÿ� ó���ϰ��� �ϴ� ���� �ۼ�
		// ���� ���� ���� �������� �̸�.
		Thread th = Thread.currentThread();
		String name = th.getName();
		for(int i=1;i<=100;i++)
		{
			System.out.println(name + " : " + i + "���� �޸��� ��");
		} // for end
	}// run end

	public static void main(String[] args) {
		ThreadEx1 th1 = new ThreadEx1("õ����");
		ThreadEx1 th2 = new ThreadEx1("����");
		System.out.println("�غ�~~");
		System.out.println("��~~~");
		System.out.println("��~~~");
		
		th1.start();
		th2.start();
		System.out.println("¦¦¦ �����մϴ�."); // Thread�� ������ �ʾƵ� Main�� ���� Main Thread�̱� ������ ���� �ڵ常 �����ϰ� �����ع����� ���� Thread�� ���������� ���ư���.
	}
}
