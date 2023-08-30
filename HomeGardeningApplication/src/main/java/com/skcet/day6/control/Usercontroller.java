package com.skcet.day6.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6.model.Users;
import com.skcet.day6.repo.Userrepo;

@RestController
public class Usercontroller {
   @Autowired
	public Userrepo urepo;
	//post user
	@PostMapping("/postUser")
	public Users postUserData(@RequestBody Users u)
	{
		return urepo.save(u);	
	}
}
