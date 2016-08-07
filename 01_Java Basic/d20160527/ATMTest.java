package d20160527;

public class ATMTest {
	public static void main(String[] args) {
		ATM atm = new ATM("홍길동", 10000);

		// 동시에 여러 사용자가 입금, 출금
		ATMThread a1 = new ATMThread(atm);
		ATMThread a2 = new ATMThread(atm);
		ATMThread a3 = new ATMThread(atm);
		
		// 입출금 시작
		a1.start();
		a2.start();
		a3.start();
	}
}
