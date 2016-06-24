package d20160624;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result.do")
public class ResultHobby extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");

		PrintWriter out = resp.getWriter();
		String hobby = req.getParameter("hobby");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>당신의 취미는??</title>");
		out.println("</head>");
		
		out.println("<body>");
		out.println("<h3>당신의 취미는 "+hobby+"입니다.</h3");
		out.println("</body>");
		out.println("</html>");
	}
}
