package kr.co.test.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
/*	@RequestMapping("login.do")
	public String login(){
		return "login/login";
	}
	@RequestMapping("loginOk.do")
	public String loginOk(HttpServletRequest req, HttpSession hs){
		String id = req.getParameter("id");
		String password = req.getParameter("pw");
		
		System.out.println(id + " " + password);
		// db 연결 후 id pw 검사 후, 존재하는 사용자라면 세션에 id 속성 담기
		hs.setAttribute("id", id);
		return "main";
	}*/
	@RequestMapping("login.do")
	public String login(){
		return "login/login";
	}
	@RequestMapping("loginOk.do")
	public String loginOk(@RequestParam(value="id")String id, @RequestParam(value="pw")String password, HttpSession hs){

		
		System.out.println(id + " " + password);
		// db 연결 후 id pw 검사 후, 존재하는 사용자라면 세션에 id 속성 담기
		hs.setAttribute("id", id);
		return "main";
	}
}
