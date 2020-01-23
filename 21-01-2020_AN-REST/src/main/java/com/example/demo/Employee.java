package com.example.demo;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.RequestParam;

@Path("/apis")
public class Employee {
	@GET
	@Produces("application/xml")
	public String[] getAllUsers() {
		String str[] = {"Abhigyan", "Nayak"};
		return str;
	}
	
	@POST
//	@Path("/create")
	public String createUser(String  id) {
		return id + "1";
	}
	
	@PUT
	public String updateUser(@RequestParam String id) {
		return "updated" + id ;
	}
	

	@DELETE	
	public String deleteUser(String id) {
		return "deleted" + id;		
	}
}
