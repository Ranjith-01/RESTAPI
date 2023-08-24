package com.skcet.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day6.model.transientmodel;
import com.skcet.day6.repository.transientrepo;

@Service
public class transientservice {
	@Autowired
	public transientrepo trepo;
	
	//post data
	public String postData(transientmodel t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//getdata
	public List<transientmodel> getData()
	{
		return trepo.findAll();
	}

}
