package nick.pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		
		writer.println("<html>");
		writer.println("<h1>My First Servlet</h1>");
		writer.println("</html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		
	}
} 
