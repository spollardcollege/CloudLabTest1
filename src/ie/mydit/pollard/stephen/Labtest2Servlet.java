package ie.mydit.pollard.stephen;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Labtest2Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
		
		String A = req.getParameter("a");
		String B = req.getParameter("b");
		String C = req.getParameter("c");
		String D = req.getParameter("d");
		
		
		if(A==null) A="1";
		if(B==null) B="1";
		if(C==null) C="1";
		if(D==null) D="1";
		
		
		int a = 0; 
		int b = 0; 
		int c = 0; 
		int d = 0; 
		try{
		a = Integer.parseInt(A);
	
		}
		catch(Exception e)
		{}
		
		try{
			
			b = Integer.parseInt(B);
			
			}
			catch(Exception e)
			{}
		
		try{
			
			c = Integer.parseInt(C);
			
			}
			catch(Exception e)
			{}
		try{
		
			d = Integer.parseInt(D);
			}
			catch(Exception e)
			{}
		
		
		
		
		
		
		int x = a - b;
		int y = c - d;
		int R = x*y;
		resp.getWriter().println("Result" + R);
		
		
		
		
	}
	
}
