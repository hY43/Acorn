package d20160624;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showMovie.do")
public class ShowMovie extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String movie = req.getParameter("movie");
		PrintWriter pw = resp.getWriter();
		String name = "";
		int num = Integer.parseInt(req.getParameter("movie"));
		if(num==1) name = "정글북";
		else if(num==2) name = "특별수사";
		else if(num==3) name = "컨저링2";
		else if(num==4) name = "아가씨";
		else if(num==5) name = "워크래프트";
		
		// 아래와 같이...HTML 문법을 다써야한다면 HTML이 복잡해질 수록 java 파일은 더 복잡해진다..이를 편하게 하기 위해 사용하는 것이 JSP이다.
		String ip = req.getRemoteAddr();
		pw.println("접속한 사용자 IP: " + ip + "<br>");
		pw.println("영화 제목: "+name);
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>movie</title>");
		pw.println("</head>");
		pw.println("<body>");
		// image는 반드시 WebContent 디렉터리로 들어가게 되며 경로 역시 현재 디렉터리가 ebContent 디렉터리로 인식된다. 
		pw.println("<br><img src='./images/movie"+ num + ".jpg' width='200px' height='200px'/>");
		pw.println("</body>");
		pw.println("</html>");
		
		
	}
}
