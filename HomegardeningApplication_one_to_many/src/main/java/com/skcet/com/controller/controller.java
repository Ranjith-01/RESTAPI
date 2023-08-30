package com.skcet.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.com.model.orderdata;
import com.skcet.com.repository.orderdatarepo;

@RestController
@RequestMapping("/map")
public class controller {
	@Autowired
	public orderdatarepo orepo;
	@PostMapping("/posttheorder")
	public orderdata postingorder(@RequestBody orderdata o)
	{
		return orepo.save(o);
	}
	@GetMapping("/gettheorder")
	public List<orderdata> getthedata(){
		return orepo.findAll();
	}

}
