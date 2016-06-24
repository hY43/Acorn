package d20160624;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/group.do")
public class ResultGirlGroup extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException, IOException {
		// 리펙토링: doGet과 doPost에서 똑같은 동작을 하기 때문에 가독성과 유지보수의 편의성을 위해 공통의 내용을 별도의 매소드로 만들고 호출하여 사용할 수 있도록 한다.
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter pw = resp.getWriter();
		//String str = req.getParameter("group"); // 데이터를 하나 밖에 못받기 때문에..두개 이상 받을 수있도록 변경
		String[] girl = req.getParameterValues("group");
		pw.print("당신이 좋아하는 걸그룹은 ");
		for(String x : girl){
			pw.print(x + " ");
		}
		pw.println("입니다.");
	}
}
