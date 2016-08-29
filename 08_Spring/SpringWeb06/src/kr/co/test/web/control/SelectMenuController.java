package kr.co.test.web.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
	Controller Interface를 통해 Controller를 구현하게 되면, handleRequest Method는 한개 동작만 할 수 있기 때문에..
	한개 클래스는 한개의 동작만을 지원한다.
	그래서 동작 개수만큼 클래스가 필요하게 된다.
	이를 해결하기 위해 Controller Annotation을 사용한다.
	Controller Annotation을 사용하면 여러 개의 동작을 처리할 여러 Method을 생성할 수 있다.
	그 후, RequestMapping Annotation을 사용하여 어떤 Method가 실행할지 지정해줄 수 있다.
*/
@Controller
public class SelectMenuController{
	/*사용자에 의해 selectHobby.do라는 요청이 오면 아래의 Method를 실행하시오*/
	@RequestMapping(value="selectHobby.do")
	public ModelAndView ccc(HttpServletRequest req){
		String[] hobby = req.getParameterValues("hobby");
		ModelAndView mav = new ModelAndView("printHobby", "hobby", hobby);
		// new ModelAndView(뷰 이름, 모델 객체명, 전달 객체);
		
		return mav;
	}
	
	@RequestMapping(value="goHome.do")
	public ModelAndView bbb(){
		ModelAndView mav = new ModelAndView("goHome","msg","집에 가고 싶어요");
		return mav;
	}
	
	@RequestMapping(value="lunch.do")
	public ModelAndView aaa(){
		ModelAndView mav = new ModelAndView("goodTime", "msg", "Enjoy your lunch");
		return mav;
	}
	
	// 위의 aaa Method와 같은 동작을 한다.
/*	@RequestMapping(value="lunch.do")
	public String bbb(Model m){
		// 반환하는 String이 View Name으로 사용가능하다.
		m.addAttribute("msg", "Enjoy your Lunch!!");
		return "goodTime";
	}*/

}
