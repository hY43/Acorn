package d20160519;
// Interface: 서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템.(마우스,키보드...)
// 자바는 단일 상속을 원칙으로 하며 다중 상속은 지원하지 않는다.
// Interface로 간접적인 다중 상속의 효과를 낼 수 있다.
public interface Flyable {
	// Interface는 반드시 추상 메서드만을 갖는다.
	// 때문에 Method 작성 시 abstract keyword를 생략해도 무방하다.
	public void 비행();
}
