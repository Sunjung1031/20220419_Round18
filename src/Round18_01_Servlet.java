import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round18_01_Servlet extends HttpServlet {
	public void init() {}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String tel = req.getParameter("tel");
		String addr = req.getParameter("addr");
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><head>");
		out.println("</head><body><center>");
		out.println("전송된 이름= ");
		out.println("<input type='text' value='" + name + "'/><br/>");
		out.println("전송된 전번= ");
		out.println("<input type='text' value='" + tel + "'/><br/>");
		out.println("전송된 주소= ");
		out.println("<input type='text' value='" + addr + "'/><br/>");
		out.println("</center></body></html>");
				
	}
	public void destroy() {}
}
