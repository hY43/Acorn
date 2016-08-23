package spring_app_aop1;

public class CustomerServiceImple implements CustomerService{
	/*Member Variable*/
	private String name;
	private String email;
	
	/*Constructor*/
	public CustomerServiceImple(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	/*Set Method*/
	public String getName(){return name;}
	public String getEmail(){return email;}

	/*Member Method*/
	@Override
	public void printName() {
		System.out.println("당신의 이름은 " + name + "입니다.");
	}

	@Override
	public void pringEmail() {
		System.out.println("당신의 이메일은 " + email + "입니다.");
	}

}
