package MyControl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*control => servlet으로 작성*/
// 1. HttpServlet 상속
// 2. doGet(), doPost() Override
// 3. annotation 추가

@WebServlet("/MyController")
public class MyControl extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cmd = req.getParameter("cmd");
		String url = ""; // 찾아가야할 JSP 위치
		String msg = ""; // 
		
		if(cmd == null || cmd.equals("hello")){
			msg = "hello MVC World";
			req.setAttribute("msg", msg);
			url = "hello.jsp";
		}else if(cmd.equals("cn")){
			msg = "니하오";
			req.setAttribute("msg", msg);
			url= "china.jsp";
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(url);
		rd.forward(req, resp);
	}
}
