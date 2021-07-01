import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class BookServ extends HttpServlet
{
       private Connection con;
       public void init()
       {
             try
               {
                     Class.forName("com.mysql.jdbc.Driver");
                     String url="jdbc:mysql://localhost:3306/mydb1";
                     con=DriverManager.getConnection(url,"root","root");
               }
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
         public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			PreparedStatement pst=con.prepareStatement("select * from book");
                            ResultSet rs=pst.executeQuery();
                         while(rs.next())
                        {
				pw.println(rs.getInt(1));
				pw.println(rs.getString(2));
				pw.println(rs.getInt(3));
                               
			}
			
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}
}