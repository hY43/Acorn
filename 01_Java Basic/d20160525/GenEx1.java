package d20160525;
// 미확정 타입: T
public class GenEx1<T> {
	// 클래스 설계 당시에 자료형을 확정하지 말고 미확정 타입으로 여기에 나중에 자료형을 넣을 거야라고 따로 명시한다.
	// 그리고 공통의 특성을 찾아서 일반화 시킨다.
	// 하나의 Class로 여러가지 자료형을 매칭하여 사용할 수 있게 된다.
	// Generic: 자료형을 컴파일 시에 결정하는 것이 아니라 Runtime 시점에서 결정하도록 일반화 시킴. 유지보수의 편의성.
	
	T[] str;
	
	public void setArray(T[] str)
	{
		this.str = str;
	}
	public void print()
	{
		for(T x : str)
			System.out.println(x);
	}
}
