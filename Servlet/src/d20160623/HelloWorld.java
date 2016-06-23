package d20160623;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml: web application의 모든 환경 설정을 기록하는 파일로, web application 규약에는 반드시 META-INF와 WEB_INF 이라는 폴더가 존재해야하며 그 내부에는 web.xml이 들어있어야한다.

// servlet: 웹 서버에서 동작하는 작은 자바 프로그램.
// 1. HttpServlet Class를 상속 받는다.
// 2. doGet(req, resp) Override
// 3. WAS에 Servlet 등록(Annotation)

/* 3. WAS에 Servlet 등록 */
/*@WebServlet("/연결 자원")*/
@WebServlet("/hello.html") // 만약 이미 있는 파일이라면 기존의 파일을 읽어서 보여주게 된다.
//@WebServlet("/hello.hi") // 안에 있는 파일 명은 말그대로 이름일 뿐이기 때문에 그냥 막적어도 상관없다. 
public class HelloWorld extends HttpServlet{ /* 1. HttpServlet 상속 */
	@Override
	/* 2. doGet Method Override */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Tomcat은 사용자의 요청을 객체로 만들고 그 이름을 req라 붙였다, 그리고 응답을 객체로 만들고 이를 resp라고 명명한다.
		
		resp.setContentType("text/html;charset=UTF-8"); // 지금 내가 응답 보내는 것은 HTML 문서이며 문자 타입은 UTF-8을 사용한다는 것을 Web Browser에게 알려줌.
		// 반드시 PrintWriter 객체 생성하기 전에 작성해야한다.
		PrintWriter pw = resp.getWriter();// PrintWriter 객체인 pw에게 응답을 작성할 수 있도록 해줘.
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title> Hello world </title>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1> My First Servlet </h1>");		
		pw.println("<h2> 안녕!! 서블릿 </h2>");		
		pw.println("</body>");
		pw.println("</html>");
	}
}
