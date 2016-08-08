package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloCommand {

	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("msg", "HelloCommand를 통한 Hello Page입니다.");
		return "hello.jsp";
	}

}
