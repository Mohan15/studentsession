package com.apple;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class StudentDBServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		resp.getWriter().println("Hello, world");
		
		
	}
}
