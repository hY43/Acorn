package kr.co.test.app;

public class Gun implements Weapon{
	int bullet;
	
	public Gun(){
		this.bullet = 6;
	}
	
	@Override
	public void use() {
		fire();
	}

	@Override
	public void drop() {
		bullet = 0;
		
	}

	@Override
	public void reuse() {
		reload();
	}
	
	public void fire(){
		if(bullet>0){
			bullet--;
			System.out.println("빵야");
		}else{
			System.out.println("틱");
		}
	}
	
	public void reload(){
		this.bullet = 6;
		System.out.println("철컥");
	}
}
