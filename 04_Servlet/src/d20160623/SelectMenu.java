package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/selectMenu.do")
public class SelectMenu extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String str = req.getParameter("menu");
		int menu = Integer.parseInt(str);
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		
		pw.print("당신이 선택한 메뉴는 <b>");
		if(menu==1) pw.print("김밥");
		else if(menu==2) pw.print("라면");
		else if(menu==3) pw.print("라면+김밥");
		else if(menu==4) pw.print("떡볶이");
		else if(menu==5) pw.print("돈까스");
		pw.println("</b>입니다.");
	}
}
