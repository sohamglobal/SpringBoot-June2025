package com.dboperations.jdbcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dboperations.jdbcdemo.entities.Account;

import java.sql.*;

@Controller
public class DBController {
	
	@GetMapping("/")
	public String home()
	{
		return "index.html";
	}
	
	@GetMapping("/search")
	public String search()
	{
		return "SearchForm.html";
	}
	
	@PostMapping("/accsearch")
	public String result(int accountNumber,Model m)
	{
		//System.out.println(accountNumber);
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		String name;
		float balance;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("select accnm,balance from accounts where accno=?");
			pst.setInt(1, accountNumber);
			rs=pst.executeQuery();
			if(rs.next())
			{
				name=rs.getString("accnm");
				balance=rs.getFloat("balance");
			}
			else
			{
				name="Not found";
				balance=0;
			}
			con.close();
		}
		catch(Exception e)
		{
			name="Error";
			balance=0;
		}
		
		m.addAttribute("number", accountNumber);
		m.addAttribute("name", name);
		m.addAttribute("bal", balance);
		return "SearchResult.jsp";
	}
	
	@GetMapping("/newacc")
	public String newAccount()
	{
		return "NewAccountForm.html";
	}
	
	@PostMapping("/addacc")
	public String addAccount(Account obj,Model m)
	{
		/*
		System.out.println(obj.getAccountNumber());
		System.out.println(obj.getAccountName());
		System.out.println(obj.getAccountType());
		System.out.println(obj.getBalance());
		*/
		Connection con;
		PreparedStatement pst;
		String status;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("insert into accounts values(?,?,?,?)");
			pst.setInt(1, obj.getAccountNumber());
			pst.setString(2, obj.getAccountName());
			pst.setString(3, obj.getAccountType());
			pst.setFloat(4,obj.getBalance());
			pst.executeUpdate();
			status="success";
			con.close();
		}
		catch(Exception e)
		{
			status="Error in insert";
			
		}

		m.addAttribute("status", status);
		return "NewAccountStatus.jsp";
	}
	
	@GetMapping("/close")
	public String closeAcc()
	{
		return "CloseAccountForm.html";
	}
	
	@PostMapping("/delacc")
	public String delAccount(int accountNumber,Model m)
	{
		Connection con;
		PreparedStatement pst;
		String status;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://mysql-java-ethanspringproject.h.aivencloud.com:11231/sharayudb?user=praffull&password=AVNS_3yYhAXQIaoNUH4UBk95");
			pst=con.prepareStatement("delete from accounts where accno=?");
			pst.setInt(1, accountNumber);
			int n=pst.executeUpdate();
			if(n>0)
				status="success";
			else
				status="not found";
			con.close();
		}
		catch(Exception e)
		{
			status="Error in delete";
			
		}	
			
		m.addAttribute("status", status);
		return "NewAccountStatus.jsp";
	}

}
