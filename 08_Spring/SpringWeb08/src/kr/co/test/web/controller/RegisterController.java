package kr.co.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
	@RequestMapping("/register/step1.do")
	public String processStep1(){
		return "step1";
	}
	@RequestMapping("/register/step2.do")
	public String processStep2(){
		return "step2";
	}
}
