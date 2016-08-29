package kr.co.test.app.web.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {
	@RequestMapping("info.nhn")
	public ModelAndView currentInfo(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("dayOfWeek", TodayInfo.getDayOfWeek());
		mav.addObject("time", TodayInfo.getTime());
		mav.addObject("ip", MyIpInfo.getMyIp());
		mav.setViewName("info");
		return mav;
	}
}
