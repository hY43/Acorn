package d20160601;

// + Singleton Design Pattern
// 1. 하나의 객체만을 생성하기 위한 패턴
// 2. 현실 세계에서 존재하는 객체가 유일한 객체가 있듯이, 가상 세계에서도 유일한 객체를 생성해서 사용할 목적으로 제공.
// + 방법
// 1. 생성자의 접근 지정자를 private
// 2. 클래스 안에서 자신의 객체를 생성한다.
// 3. 외부에서 OnlyOne 객체를 제공하는 메서드를 정의한다.

public class OnlyOne {
	static OnlyOne oo = new OnlyOne();
	private OnlyOne(){}
	public static OnlyOne getInstance(){
		return oo;
	}
}
