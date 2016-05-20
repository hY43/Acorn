package hw20160519;

public class Bank {
	/* Member Variable */
	String account; // 계좌 번호
	String bankName; // 은행 명 ex)신한, 우리,,,
	String name; // 계좌 주명
	int balance; // 잔액
	
	/* Constructor */
	public Bank(){}
	public Bank(String account, String bankName, String name, int balance)
	{
		this.account = account;
		this.bankName = bankName;
		this.name = name;
		this.balance = balance;
	}
	
	/* Member Method */
	public void send(Bank user, int money)
	{
		if(this.bankName != user.bankName)
		{
			this.balance -= 500;
			this.balance -= money;
			user.balance += money;
			System.out.println("타행 거래에는 수수료 500원이 붙습니다.");
			System.out.println("[" + name + "] 계좌번호(" + account + ") 잔액: " + this.balance);
		}
		else
		{
			this.balance -= money;
			user.balance += money;
			System.out.println("[" + name + "] 계좌번호(" + account + ") 잔액: " + this.balance);
		}
	}
	public void print()
	{
		System.out.println("[" + this.name + "] 계좌번호(" + this.account + ") 잔액: " + this.balance);
	}
}

