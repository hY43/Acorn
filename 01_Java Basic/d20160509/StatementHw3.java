package d20160509;
//Quiz, 아래와 같이 출력하시오.

//*
//**
//***
//****
//*****

// StatementHw3 Class Start
public class StatementHw3 {
	// Main Method Start
	public static void main(String[] args)
	{
		String str = ""; // 아무 것도 입력되지 않는 문자열 변수를 생성 후, '*' 문자를 이어붙이기 위한 String Type의 변수 str 선언 및 초기화. 

		for(int i=1;i<6;i++) // 주어진 Line 수에 맡게 출력하기 위한 반복문.
		{
			str = str + "*"; // 첫번째에는 한개의 '*'문자를 출력하고 Line이 증가함에 따라 1개의 '*'문자를 추가하기 위해 연결 연산자 사용.

			System.out.println(str); // 실제 '*'문자 출력
		}
	}
	// Main Method End
}
// StatementHw3 Class End