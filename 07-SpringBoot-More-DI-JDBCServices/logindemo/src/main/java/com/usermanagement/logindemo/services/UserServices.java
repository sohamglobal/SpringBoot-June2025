package com.usermanagement.logindemo.services;

import org.springframework.stereotype.Service;
import java.sql.*;

@Service
public class UserServices {
	
	public String checkUser(String unm,String ps)
	{
		String status;
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select * from users where userid=? and password=?");
			pst.setString(1, unm);
			pst.setString(2, ps);
			rs=pst.executeQuery();
			if(rs.next())
				status="UserHome.jsp";
			else
				status="Failure.jsp";
			
			con.close();
		}
		catch(Exception e)
		{
			status="Failure.jsp";
		}
		
		
		return status;
	}
	
	public String registerUser()
	{
		return "";
	}
	
	public String changePassword()
	{
		return "";
	}

}
