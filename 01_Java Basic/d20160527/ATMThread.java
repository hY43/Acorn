package d20160527;

import java.util.Random;

public class ATMThread extends Thread{
	ATM atm;
	Random rnd = new Random();
	
	public ATMThread(ATM atm){
		this.atm = atm;
	}
	
	@Override
	public void run() {
		// �Ա������ �ݺ��ؼ� 10ȸ ����
		boolean flag = true;
		for(int i=0;i<10;i++)
		{
			if(flag)atm.deposit(rnd.nextInt(5)*1000); // 0~5000���� �������� ����� �ݺ�
			else atm.withDraw(rnd.nextInt(5)*1000);
			flag = !flag;
		}
	}
}
