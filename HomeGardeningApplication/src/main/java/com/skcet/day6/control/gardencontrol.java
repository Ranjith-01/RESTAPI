package com.skcet.day6.control;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.skcet.day6.model.gardenmodel;

import com.skcet.day6.service.gardenservice;

@RestController
public class gardencontrol {
	@Autowired
	public gardenservice serv;
	
	//post mapping
	@PostMapping("/post")
	public String post(@RequestBody gardenmodel mr)
	{
		serv.savegarden(mr);
		return "your data is saved in database";
	}
	
	//get mapping
	@GetMapping("/get")
	public  List<gardenmodel> get()
	{
		return serv.getgarden();
	}
	
	//put mapping
	@PutMapping("/put")
	public gardenmodel update(@RequestBody gardenmodel mrs)
	{
		return serv.updategarden(mrs);
	}
	//delete mapping using path variable
	@DeleteMapping("/delete/{id}")
	public String remove (@PathVariable("id") int id)
	{
		serv.deletegarden(id);
		return "Matrix with id "+id+" is deleted";
	}
	
	//delete mapping using request param
	@DeleteMapping("/byReqParm")
	public String removeByRequest(@RequestParam ("id") int id)
	{
		serv.deletegarden(id);
		return "Matrix with id "+id+" is deleted";
	}
	
	//if there is no id
	@DeleteMapping("/deletematrixif/{id}")
	public ResponseEntity<String> deleteMatrix(@PathVariable int id){
		boolean deleted = serv.deletegardenif(id);
		if(deleted) {
			return ResponseEntity.ok("garden with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Garden with ID "+id+" not found");
		}
	}
	
	//getUserById
		@GetMapping("users/{userId}")
		public ResponseEntity<?> getUserById(@PathVariable int userId)
		{
	        Optional<gardenmodel> home = serv.getuserById(userId);
			if(home != null) {
				return ResponseEntity.ok(home);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(home);
		}
		
		//sort by asc
		@GetMapping("/sortByAsc/{name}")
		public List<gardenmodel> sortByAsc(@PathVariable("name") String nameofVegitable)
		{
			return serv.sortByAsc(nameofVegitable);
		}
		
    	//sort by dsc
		@GetMapping("/SortByDsc/{name}")
		public List<gardenmodel>SortByDsc(@PathVariable("name") String nameofVegitable)
		{
			return serv.sortByDesc(nameofVegitable);
		}
		
		//paging
		@GetMapping("pagination/{number}/{s}")
		public List<gardenmodel> paginationValue(@PathVariable("number") int no,@PathVariable ("s") int size)
		{
			return serv.pagination(no, size);
		}
		//paging and sort
		@GetMapping("paginationdetails/{number}/{s}/{name}")
		public List<gardenmodel> paginationAndSortingValue(@PathVariable("number") int no,@PathVariable ("s") int size,@PathVariable ("name") String name)
		{
			return serv.paginationAndSort(no, size, name);
		}
	
		//get all row
		@GetMapping("/getAllrows")
		public List<gardenmodel> getAllRows()
		{
			return serv.getAllRows();
		}
		//get data
		@GetMapping("/getSpecific/{addr}/{name}")
		public List<gardenmodel> getSpecrows(@PathVariable("addr") String addr,@PathVariable ("name") String name)
		{
			return serv.getSpeceficrows(addr, name);
		}
		//get data by char
		@GetMapping("/getByName/{char}")
		public List<gardenmodel> getByName(@PathVariable("char") String name)
     	{
			return serv.getByChar(name);
		}
		//delete data
		@DeleteMapping("/deleteRowValue/{id}")
		public String deleteRow(@PathVariable("id") int id)
		{
			return serv.deleteValueById(id)+" deleted";
		}
		
		//update the data
		@PutMapping("updateDataValue/{contact}/{id}")
		public String updateData(@PathVariable("address") String addr,@PathVariable("id") int id)
		{
			return serv.updateDataById(addr, id)+" data is updated";
		}
		//get by model class
		@GetMapping("getting")
		public List<gardenmodel> getting()
		{
			return serv.gettingmodelValue();
			
		}
		
		//get data
		@GetMapping("/getSpecrowsbymodelvalue/{addr}/{name}")
		public List<gardenmodel> getSpecrowsbymodel(@PathVariable("addr") String addr,@PathVariable ("name") String name)
		{
			return serv.getSpecrowsmodelvalue(addr, name);
    	}		
		//delete using model class
		@DeleteMapping("/deleteByModelValue/{id}")
		public int deleteByModelValue(@PathVariable("id") int id)
		{
		  return serv.deleteUsingmodelValue(id);
    	}
		//update the data
		@PutMapping("updateDatabymodel/{address}/{id}")
		public int updateDatabymodel(@PathVariable("address") String addr,@PathVariable("id") int no_id)
		{
		  return serv.updateDatamodelByValue(addr, no_id);
		  
		}
		
}