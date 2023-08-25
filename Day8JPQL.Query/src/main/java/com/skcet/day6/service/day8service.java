package com.skcet.day6.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day6.model.day8model;

import com.skcet.day6.reposity.day8repo;

@Service
public class day8service {
	@Autowired
	public day8repo drepo;
	
	//post data
	public String posting(day8model d)
	{
		drepo.save(d);
		return "Your data is saved successfully";
	}
	//get data
	public List<day8model> getting()
	{
		return drepo.findAll();
	}

	//get all data
	public List<day8model> getAllRows()
	{
		return drepo.getAllRows();
	}
	//get Spec data
	public List<day8model> getSpecrows(String addr,String name)
	{
		return drepo.getSpecRows(addr, name);
	}
	//get by Char
	public List<day8model> getDataByChar(String name)
	{
		return drepo.getByname(name);
	}
	//delete the data
	public int deleteById(int id)
	{
		return drepo.deleteId(id);
	}
	//update the data 
	public int updateData(String addr,int no_id) {
		return drepo.updateById(addr, no_id);
	}
	
	//get using model class
	public List<day8model> gettingmodel()
	{
		return drepo.get();
	}
	
	//get using model class
	public List<day8model> getDatafromModel(String name)
	{
		return drepo.getByName(name);
	}
	
	// get specific data
    public List<day8model> getSpecrowsmodel(String addr,String name)
	{
		return drepo.getSpecRowsBymodel(addr, name);
	}
	
	//delete using model class
	public int deleteUsingmodel(int id)
	{
		return drepo.deleteBymodel(id);
	}
	
	//updete by model
	public int updateDatamodel(String addr,int no_id) {
		return drepo.updateByIdmodel(addr, no_id);
	}

}
