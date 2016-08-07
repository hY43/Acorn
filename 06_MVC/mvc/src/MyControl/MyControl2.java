package MyControl;

import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mycontrol.do")
public class MyControl2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String type = req.getParameter("type");
		String msg = "";
		String url = "";
		// IP 구하기
		InetAddress inetAddress = InetAddress.getLocalHost();
		String ipAddress = inetAddress.getHostAddress();
		// 현재 시간 구하기
		long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String str = dayTime.format(new Date(time));
				
		if(type==null||type.equals("")){
			url="welcome.jsp";
			msg="Welcome!!!!";
			req.setAttribute("msg", msg);
		}else if(type.equals("ip")){
			url="ip.jsp";
			msg="당신의 IP는 " + ipAddress + "입니다.";
			req.setAttribute("msg", msg);
		}else if(type.equals("time")){
			url="time.jsp";
			msg="현재 시간 " + str + " 입니다.";
			req.setAttribute("msg", msg);
		}
		
		RequestDispatcher rd = req.getRequestDispatcher(url);
		rd.forward(req, resp);
	}
}
