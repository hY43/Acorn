package d20160527;

public class ATMTest {
	public static void main(String[] args) {
		ATM atm = new ATM("ȫ�浿", 10000);

		// ���ÿ� ���� ����ڰ� �Ա�, ���
		ATMThread a1 = new ATMThread(atm);
		ATMThread a2 = new ATMThread(atm);
		ATMThread a3 = new ATMThread(atm);
		
		// ����� ����
		a1.start();
		a2.start();
		a3.start();
	}
}
