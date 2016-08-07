package d20160516;

// 마린Test Class Start.
public class 마린Test {
	// 마린 Class를 Test하기 위한 Class/Method
	public static void main(String[] args)
	{
		마린 m1 = new 마린(); // 마린 Class를 이용한 m1 객체 생성과 기본 생성자를 통한 초기화.
		마린 sm = new 마린(500); // 체력 500짜리 슈퍼 마린.
		/* **********
		m1.상태정보();
		m1.스팀팩();
		m1.스팀팩();
		m1.스팀팩();
		m1.스팀팩();
		m1.스팀팩();
		m1.상태정보();	
		********** */
		sm.상태정보();
		
	}
}
// 마린Test Class End.

