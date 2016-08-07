package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String> list; // ���� �ڵ����� ���� ArrayList
	String[] carNameList = { "�ƿ��", "����", "�غ�ī", "Ÿ��" }; // īŻ�α�, �ڵ��� ���� ������� �� �迭�� �ִ� ��ҵ鸸 List�� �Էµȴ�.
	Random rnd = new Random(); // Random ���� �ֱ� ���� Random ��ü ����.

	public Car() {
		list = new ArrayList<String>(); // ArrayList �ʱ�ȭ.
	}

	// ���� �����ϴ� �޼��� push()
	public synchronized void push(String car) {
		System.out.println("�ڵ����� ����Ǿ����ϴ�." + car);
		list.add(car); // Producter�� ���� �ڵ����� �̸��� �Է¹޾� ArrayList�� �ִ´�.
		// ��ٸ��� ȣ���� �Ͼ����
		// this.notify(); // ���Ƿ� �ϳ��� �����.(������ ������� ���Ƿ� �ϳ��� ����� ������ ������ ���Ͼ�� Thread�� ������ ���̴�.)
		this.notifyAll(); // ��ü�� �ٱ����.
		System.out.println("���� ����: " + list); // ���� ArrayList�� ����ִ� ����� ����Ѵ�.
	}

	// ������ �޼��� pop()
	public synchronized String pop() {
		if (list.size() == 0) {
			System.out.println("ȣ���� ��ٸ�����");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			String carName = list.remove(list.size() - 1);
			System.out.println("���: " + carName);
			return carName;
		}		
		return "";
	}

	// ���� �̸� ������
	public synchronized String getCar() {
		// �����ϰ� ���� �̸� ������
		// return list.get((int)(Math.random()*list.size()));
		return carNameList[rnd.nextInt(carNameList.length)];
	}
}
