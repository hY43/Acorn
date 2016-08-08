package MyControl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mycontrol.do")
public class MyControl3 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req,resp);
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
		// 사용자 화면을 구성하는 것은 Control에서 직접 하지 않고 View에서 화면을 구성한다.
		String cmd = req.getParameter("cmd");
		String url = null; // 찾아갈 URL.
		String msg = null; // View로 전달할 메세지.
		if(cmd == null || cmd.equals("hello")){
			url = "hello.jsp";
			msg="안녕";
			req.setAttribute("msg", msg);
		}else if(cmd.equals("ip")){
			// 접속한 사용자의 ip를 출력
			String ip = req.getRemoteAddr(); // ip 얻기
			url = "ip.jsp";
			req.setAttribute("msg", ip);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(url);
		try {
			rd.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
