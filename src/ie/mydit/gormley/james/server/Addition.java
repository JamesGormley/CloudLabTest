package ie.mydit.gormley.james.server;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Addition extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Labtest Time");
		
		//Declare Variables
		Integer Aint = 0, Bint = 0,Cint = 0, Dint=0, Answer = 0, check = 0;
		String AString = "0";
		String BString = "0";
		String CString = "0";
		String DString = "0";
		
		//Put variables in strings
		if (req.getParameter("A") != null)
			AString = req.getParameter("A");
		if (req.getParameter("B") != null)
			BString = req.getParameter("B");
		if (req.getParameter("C") != null)
			CString = req.getParameter("C");
		if (req.getParameter("D") != null)
			DString = req.getParameter("D");
		
		//If variable exists, parse to integer or Incompatible variable
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
		if(CString != null)
			try
			{
				Cint = Integer.parseInt(CString);
			}
			catch(NumberFormatException e)
			{
				resp.getWriter().println("Incompatible value for C dummy!\n");
				check = 1;
			}
		if(DString != null)
			try
			{
				Dint = Integer.parseInt(DString);
			}
			catch(NumberFormatException e)
			{
				resp.getWriter().println("Incompatible value for D dummy!\n");
				check = 1;
			}


			
		//Check variable must be set to 1 to stop calculation from running with no variables
		if ( check == 0)
		{
			Answer = (( Aint - Bint)*(Cint - Dint));
			resp.getWriter().println("A: " +AString+ " B: " +BString+ " C: " +CString+ " D: " +DString+ " \n(A - B) * (C - D)= " +Answer);
		}
		
	}
}
