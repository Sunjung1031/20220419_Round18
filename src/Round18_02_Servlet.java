import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Round18_02_Servlet extends HttpServlet {
	public void init() {}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String id = req.getParameter("ID");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><body><center>");
		out.println(id + "님 반갑습니다.");
		out.println("</center></body></html>");
			
		
	}

	public void destroy() { }
}
