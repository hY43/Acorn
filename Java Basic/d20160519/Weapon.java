package d20160519;

public interface Weapon {
	// interface이므로 Abstract Method 만 구현할 수 있다.
	// 그러므로 실제 내용은 각각의 Class에서 구현하기 때문에 같은 Method라도 실제 동작은 
	// 각각의 Class 마다 다르게 동작하게되고 이러한 성질을 다형성이라고 한다.
	public void use();
	public void reuse(); // 총: 재장전, 칼: 칼뽑기...
	public void drop();
}
