package MyControl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.HelloCommand;
import Action.IpCommand;

@WebServlet("/myControl4.do")
public class MyControl4 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) {
		String type = req.getParameter("type");
		String url = "";
		String msg = "";
		
		if(type == null || type.equals("hello")){
			// Model: 작업을 처리
			HelloCommand hc = new HelloCommand();
			url = hc.execute(req, resp);
		}else if(type.equals("ip")){
			IpCommand ic = new IpCommand();
			url = ic.execute(req, resp);
		}
		// View로 이동

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
