package com.skcet.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6.model.day7model;
import com.skcet.day6.service.day7service;

@RestController
public class day7controller {
	@Autowired
	public day7service serv;
	
	//posting data
	@PostMapping("/insertData")
	public String insertData(@RequestBody day7model t)
	{
		serv.saveData(t);
		return "Your data is stored in database";
				
	}
	
	//getting data
	@GetMapping("/getData")
	public List<day7model> getData()
	{
		System.out.println("Datas in the Database");
		return serv.getData();
	}
	
	//sort by asc
	@GetMapping("/SortByAsc/{name}")
	public List<day7model>SortByAsc(@PathVariable("name") String name)
	{
		return serv.sortByAsc(name);
	}
	

	//sort by dsc
	@GetMapping("/SortByDsc/{name}")
	public List<day7model>SortByDsc(@PathVariable("name") String name)
	{
		return serv.sortByDsc(name);
	}
	
	//paging
	@GetMapping("pagination/{number}/{s}")
	public List<day7model> paginationValue(@PathVariable("number") int no,@PathVariable ("s") int size)
	{
		return serv.pagination(no, size);
	}
	//paging and sort
	@GetMapping("paginationdetails/{number}/{s}/{name}")
	public List<day7model> paginationAndSortingValue(@PathVariable("number") int no,@PathVariable ("s") int size,@PathVariable ("name") String name)
	{
		return serv.paginationAndSort(no, size, name);
	}
	
}