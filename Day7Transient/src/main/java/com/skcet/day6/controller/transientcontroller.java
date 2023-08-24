package com.skcet.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6.model.transientmodel;
import com.skcet.day6.service.transientservice;

@RestController
public class transientcontroller {
	@Autowired
	public transientservice tserv;
	
	//posting the data
	@PostMapping("/insertingDetails")
	public String insertingDetails(@RequestBody transientmodel t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/gettingDetails")
	public List<transientmodel> gettingData(){
		return tserv.getData();
	}

}
