import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class Round18_02_Filter implements Filter {
	public void init(FilterConfig fc) throws ServletException{}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		String id = request.getParameter("ID");
		if(id == null || id.trim().length() ==0) {
			HttpServletResponse h_response = (HttpServletResponse)response;
				h_response.sendRedirect("Round18_02_Servlet_Error.html");
		}
		chain.doFilter(request, response);
		
	}
	
	public void destroy() {}

}
