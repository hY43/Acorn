package d20160527;

public class Producter implements Runnable{
	private Car car;
	public Producter(Car car) {
		this.car = car;
	}
	
	@Override
	public void run() {
		// �ڵ��� 50�� �����ؼ� ���� �ֱ�.
		for(int i=0;i<60;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			car.push(car.getCar());
		}
	}
}
