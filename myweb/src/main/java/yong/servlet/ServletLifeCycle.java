package yong.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet{
	
	int count;
	
	public ServletLifeCycle() {
		//멤버변수의 초기화
		System.out.println("1)생성자 호출됨!!");
		count=0;
	}
	
	@Override
	public void init() throws ServletException {
		//기능의 초기화
		System.out.println("2)init()메서드 호출됨!");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw=resp.getWriter();
		
		pw.println("<html><head><title>");
		pw.println("서블릿 라이프 사이클");
		pw.println("</title></head><body>");
		count++;
		pw.println("<h1>"+count+"번째 접속중!!</h1>");
		pw.println("</body></html>");
		pw.close();
		
		System.out.println("3)service메서드 수행됨~~");
	}
	@Override
	public void destroy() {
		//소멸자 or 종결자
		System.out.println("4>destroy()메서드 수행됨");
	}
}
