package com.skcet.day6.control;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.skcet.day6.model.orderdata;
import com.skcet.day6.repo.orderdatarepo;

@RestController
@RequestMapping("/relation")
public class orderdatacontrol {
	@Autowired
	public orderdatarepo odrepo;
	//post the data
	@PostMapping("/postorderdata")
	public orderdata postingOrderData(@RequestBody orderdata h)
	{
		return odrepo.save(h);
		
	}

}
