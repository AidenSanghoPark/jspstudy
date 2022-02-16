package yong.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuguServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		userProcess(req, resp);
	}
	protected void userProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=resp.getWriter();
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
	pw.println("<html>");
	
	pw.println("<head>");
	pw.println("<title>구구단을 외자 구구단을 외자</title>");
	pw.println("</head>");
	
	pw.println("<body>");
	pw.println("<script>");
	//pw.println("for(var i=1;i<=9<i++){}");
	pw.println("<h1>서블릿 버전 구구단</h1>");
	//pw.println("for(var i=1;i<=9;i++) {for(var j=2;j<=9;j++) {document.write(i+'x'+j+'='+(i*j))}}");
	pw.println("<table border=\"1\" width=\"550\">");
	for(int i=1;i<=9;i++) {
		pw.println("<tr>");
		for(int j=2;j<=9;j++) {
			pw.println("<td>");
			pw.println(j+"*"+i+"="+(i*j));
			pw.println("</td>");
		}
		pw.println("</tr>");
	}
	
	pw.println("</script>");
	pw.println("</body>");
	
	pw.println("</html>");
/////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		pw.close();
	}
	
	
}
