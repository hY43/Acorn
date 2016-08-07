package d20160527;

import java.util.Random;

public class Customer implements Runnable{
	private Car car;
	Random rnd = new Random();
	public Customer(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		// ���� 20�� ����
		// ������ 20�� ������
		for(int i=0;i<20;i++)
		{
			try {
				Thread.sleep(rnd.nextInt(3)*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String carName = car.pop();
		}
	}
}
