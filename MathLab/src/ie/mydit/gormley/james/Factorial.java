package ie.mydit.gormley.james;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Factorial extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("You want a factorial eh?");
		
		Integer Aint = 0, i = 0, fact = 1, Answer = 0, check = 0;
		String AString = "0";
		if (req.getParameter("A") != null)
			AString = req.getParameter("A");
		
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
			
		
		if ( check == 0)
		{
			
			for ( i = 1; i <= Aint; i++)
			{
				fact = fact*i;
			}
			
			Answer = fact ;
			
			resp.getWriter().println("Factorial " +AString+ " = " +Answer);
		}
		
	}
}
