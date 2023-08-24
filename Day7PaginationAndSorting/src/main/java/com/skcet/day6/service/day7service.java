package com.skcet.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.skcet.day6.model.day7model;
import com.skcet.day6.repository.day7Repo;

@Service
public class day7service {
	@Autowired
	public day7Repo repo;
	
	//inserting data
	public String saveData(day7model n)
	{
		 repo.save(n);
		 return "Your data is stored";
		
	}
	
	//get data
	public List<day7model> getData()
	{
		return repo.findAll();
	}
	
	//sort by asc
  	public List<day7model> sortByAsc(String name)
  	{
  		return repo.findAll(Sort.by(name).ascending());
  	}
  //sort by desc
  	public List<day7model> sortByDsc(String name)
  	{
  		return repo.findAll(Sort.by(name).descending());
  	}
  	//paging
  	public List<day7model> pagination(int no,int size)
  	{
  		Page<day7model> count = repo.findAll(PageRequest.of(no, size));
  		return count.getContent();
  	}
  	
  	//pagination and sorting
  	public List<day7model> paginationAndSort(int no,int size,String name)
  	{
  		Page<day7model> count1 = repo.findAll(PageRequest.of(no, size, Sort.by(name)));
  		return count1.getContent();
  	}
  	

}