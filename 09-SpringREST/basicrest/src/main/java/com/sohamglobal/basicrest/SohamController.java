package com.sohamglobal.basicrest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.basicrest.models.User;

@RestController
@RequestMapping("/soham/api")
public class SohamController {
	
	@GetMapping("/test")
	public String test()
	{
		return "first rest tested ok";
	}
	
	@GetMapping("/oneuser")
	public User getOneUser()
	{
		User obj=new User();
		obj.setUserId("jota");
		obj.setPassword("liverpool");
		obj.setUserName("diago jota");
		obj.setGender("male");
		obj.setAge(28);
		
		return obj;
	}
	
	@GetMapping("/userlist")
	public List<User> getUserList()
	{
		List<User> list=new ArrayList<>();
		User u1=new User("buttler","england","jos buttler","male",33);
		User u2=new User("graph","germany","steffi graph","female",52);
		list.add(u1);
		list.add(u2);
		return list;
	}

}
