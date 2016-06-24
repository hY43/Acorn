package d20160624;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/lifeCycle.do")
public class ServletLifeCycle extends GenericServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init() 호출중");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// 새로 고침할때마다 계속 service가 생성되는데 메모리가 가득 차거나 톰캣을 종료하는 경우 가장 오래된 service부터 제거되기 시작한다.
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		System.out.println("service() 호출중");
		pw.println("서비스 호출중...");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출중");
	}

}
