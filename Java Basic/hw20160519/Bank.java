package hw20160519;

public class Bank {
	/* Member Variable */
	String account;
	String bankName;
	String name;
	int deposit;
	
	/* Constructor */
	public Bank(){}
	public Bank(String account, String bankName, String name, int deposit)
	{
		this.account = account;
		this.bankName = bankName;
		this.name = name;
		this.deposit = deposit;
	}
	
	/* Member Method */
	public void send(Bank user, int money)
	{
		if(this.bankName != user.bankName)
		{
			this.deposit -= 500;
			this.deposit -= money;
			user.deposit += money;
			System.out.println("타행 거래에는 수수료 500원이 붙습니다.");
			System.out.println("[" + name + "] 계좌번호(" + account + ") 잔액: " + this.deposit);
		}
		else
		{
			this.deposit -= money;
			user.deposit += money;
			System.out.println("[" + name + "] 계좌번호(" + account + ") 잔액: " + this.deposit);
		}
	}
	public void print()
	{
		System.out.println("[" + this.name + "] 계좌번호(" + this.account + ") 잔액: " + this.deposit);
	}
}

