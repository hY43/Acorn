package kr.co.test.app3;

public class LaserPrinter implements Printer{
	int red, green, blue; // 현재 카트리지 잔량
	
	public LaserPrinter(){}
	public LaserPrinter(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed(){return red;}
	public void setRed(int red){this.red = red;}
	public int getGreen(){return green;}
	public void setGreen(int green){this.green = green;}
	public int getBlue(){return blue;}
	public void setBlue(int blue){this.blue = blue;}
	
	@Override
	public void print() {
		// r,g,b가 0이상일때만 컬러로 출력합니다.
		// 0이하이면 카트리지를 갈아주세요
		if(red>=0 && green>=0 && blue>=0){
			System.out.println("컬러로 출력합니다.");
		}else{
			System.out.println("카트리지를 갈아주세요");
		}
		System.out.println("------ 현재 잔량 ------");
		System.out.println("red: " + red);
		System.out.println("green: " + green);
		System.out.println("blue: " + blue);
		
	}

}
