package hw20160519;

public class Bank {
	String account;
	String bankName;
	String name;
	int deposit;
	Bank(){}
	Bank(String account, String bankName, String name, int deposit)
	{
		this.account = account;
		this.bankName = bankName;
		this.name = name;
		this.deposit = deposit;
	}
	void send(Bank user, int money)
	{
		if(this.bankName != user.bankName)
		{
			this.deposit -= 500;
			this.deposit -= money;
			user.deposit += money;
			System.out.println("Ÿ�� �ŷ����� ������ 500���� �ٽ��ϴ�.");
			System.out.println("[" + name + "] ���¹�ȣ(" + account + ") �ܾ�: " + this.deposit);
		}
		else
		{
			this.deposit -= money;
			user.deposit += money;
			System.out.println("[" + name + "] ���¹�ȣ(" + account + ") �ܾ�: " + this.deposit);
		}
	}
	void print()
	{
		System.out.println("[" + this.name + "] ���¹�ȣ(" + this.account + ") �ܾ�: " + this.deposit);
	}
}

