package spring_app_aop6;

public class WeaponImple implements Weapon{
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}

	
	public WeaponImple(){}
	public WeaponImple(String type) {
		super();
		this.type = type;
	}


	@Override
	public void fire() {
		System.out.println(type + "총으로 빵하고 쏩니다.");
	}

	@Override
	public void reload() {
		System.out.println("reloading...철커덕");
	}

}
