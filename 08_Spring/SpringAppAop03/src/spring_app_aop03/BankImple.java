package spring_app_aop03;

public class BankImple implements Bank{
	@Override
	public void transfer() {
		System.out.println("이체이체");
	}

}
