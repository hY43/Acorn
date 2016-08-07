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
		
		String d = req.getParameter("dan"); // index.html에서 넘겨 받은 dan 값을 문자열 변수 d에 대입
		int dan = Integer.parseInt(d); // 문자열을 정수형으로 변경하여 정수형 변수 dan에 대입
		
		resp.setContentType("text/html;charset=UTF-8"); // client에게 응답 줄 값에 대한 한글 처리를 하기 위한 UTF-8 적용. 
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
