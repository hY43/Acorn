package kr.co.test.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	// hello.do ==> hello.jsp를 찾아갈 수 있게
	// hi() 구성
//	1. hello.do라는 요청이 오면
	@RequestMapping("hello.do")
	public String hi(){
//		2. 이런 view 찾아가
		return "hello";	// 찾아갈 view의 이름
	}
}
