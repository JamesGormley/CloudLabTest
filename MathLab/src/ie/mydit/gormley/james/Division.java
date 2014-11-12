package ie.mydit.gormley.james;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Division extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Divide and Conquer!");
		
		Integer Aint = 1, Bint = 1, Answer = 1, check = 0;
		String AString = "1";
		String BString = "1";
		if (req.getParameter("A") != null)
			AString = req.getParameter("A");
		if (req.getParameter("B") != null)
			BString = req.getParameter("B");
		
		if(AString != null)
			try
			{
				Aint = Integer.parseInt(AString);
			}
			catch(NumberFormatException e)
			{
				resp.getWriter().println("Incompatible value for A dummy!\n");
				check = 1;
			}
		if(BString != null)
			try
			{
				Bint = Integer.parseInt(BString);
			}
			catch(NumberFormatException e)
			{
				resp.getWriter().println("Incompatible value for B dummy!\n");
				check = 1;
			}
			
		
		if ( check == 0)
		{
			Answer = ( Aint / Bint);
			resp.getWriter().println("A: " +AString+ " B: " +BString+ " A / B = " +Answer);
		}
		
	}
}
