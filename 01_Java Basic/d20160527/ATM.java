package d20160527;

public class ATM {
	/* Member Variable */
	private String account;
	private int balance;
	
	/* Constructor */
	public ATM(){}
	public ATM(String account, int balance){
		this.account = account;
		this.balance = balance;
	}
	/* Get/Set Method */
	public String getAccount(){return account;}
	public void setAccount(String account){this.account = account;}
	public int getBalance(){return balance;}
	public void setBalance(int balance){this.balance = balance;}
	
	/* Member Method */
	// T, 동시에 서로 같이 작업하다 보면 발생되는 문제 (DB) lock => (JAVA) synchronized
	// 한개 객체에 여러 Thread가 한꺼번에 접근하면 내용이 잘못 변경될 수있는데 이때 동기화(Synchronized) Method로 선언하면
	// 한개 Thread가 이 Method에 접근하면 다른 Thread는 해당 Thread의 작업이 끝날 때까지 이 Method에 접근할 수 없다.
	// 다른 Thread는 Wait 상태.
	public synchronized void deposit(int money)
	{
		this.balance += money;
		System.out.println(money + "원 입금합니다.");
		System.out.println("잔액 : " + this.balance);
	}
	
	public synchronized void withDraw(int money)
	{
		if(this.balance >= money){
			this.balance -= money;
			System.out.println(money + "원 출금합니다.");
		}else{
			System.out.println("잔액이 부족합니다.");
		}
		System.out.println("잔액 : " + this.balance);
	}
}
