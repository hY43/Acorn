package d20160527;

import java.util.ArrayList;
import java.util.Random;

public class Car {
	ArrayList<String> list; // 실제 자동차를 넣을 ArrayList
	String[] carNameList = { "아우디", "벤츠", "붕붕카", "타요" }; // 카탈로그, 자동차 보유 목록으로 이 배열에 있는 요소들만 List에 입력된다.
	Random rnd = new Random(); // Random 값을 주기 위한 Random 객체 생성.

	public Car() {
		list = new ArrayList<String>(); // ArrayList 초기화.
	}

	// 차량 생성하는 메서드 push()
	public synchronized void push(String car) {
		System.out.println("자동차가 생산되었습니다." + car);
		list.add(car); // Producter로 부터 자동차의 이름을 입력받아 ArrayList에 넣는다.
		// 기다리는 호갱님 일어나세요
		// this.notify(); // 임의로 하나만 깨운다.(순서에 상관없이 임의로 하나만 깨우기 때문에 영원히 안일어나는 Thread도 존재할 것이다.)
		this.notifyAll(); // 전체를 다깨운다.
		System.out.println("차고 상태: " + list); // 현재 ArrayList에 들어있는 목록을 출력한다.
	}

	// 꺼내는 메서드 pop()
	public synchronized String pop() {
		if (list.size() == 0) {
			System.out.println("호갱님 기다리세요");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			String carName = list.remove(list.size() - 1);
			System.out.println("출고: " + carName);
			return carName;
		}		
		return "";
	}

	// 차량 이름 얻어오기
	public synchronized String getCar() {
		// 랜덤하게 차량 이름 얻어오기
		// return list.get((int)(Math.random()*list.size()));
		return carNameList[rnd.nextInt(carNameList.length)];
	}
}
