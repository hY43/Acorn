package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuGuDan.do")
public class GuGuDan extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String d = req.getParameter("dan");
		int dan = Integer.parseInt(d);
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
						
		for(int i=1;i<10;i++){
			pw.println("<html>");
			pw.println("<head>");
			pw.println("</head>");
			pw.println("<body>");
			pw.println("<table border = '1px' width='5px'>");
			pw.println("<tr>");
			pw.println("<td>"+dan+"</td>");
			pw.println("<td>*</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+(i*dan)+"</td>");
			pw.println("</tr>");
			pw.println("</table>");
			pw.println("</body>");			
			pw.println("</html>");
		}
	}
}
