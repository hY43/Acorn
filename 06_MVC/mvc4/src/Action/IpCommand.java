package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IpCommand implements Action{
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String ip = req.getRemoteAddr();
		req.setAttribute("msg", ip);
		return "jsp02/ip.jsp";
	}

}
