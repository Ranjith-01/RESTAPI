package com.skcet.day5.control;

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

import com.skcet.day5.model.matrixmodel;
import com.skcet.day5.service.matrixservice;

@RestController
public class matrixcontrol {
	@Autowired
	public matrixservice serv;
	
	//post mapping
	@PostMapping("/postMatrix")
	public String postmatrix(@RequestBody matrixmodel mr)
	{
		serv.saveMatrix(mr);
		return "your data is saved in database";
	}
	
	//get mapping
	@GetMapping("/getMatrix")
	public  List<matrixmodel> getmatrix()
	{
		return serv.getMatrix();
	}
	
	//put mapping
	@PutMapping("/putMatrix")
	public matrixmodel updatematrix(@RequestBody matrixmodel mrs)
	{
		return serv.updatematrix(mrs);
	}
	//delete mapping using path variable
	@DeleteMapping("/deleteMatrix/{id}")
	public String removematrix (@PathVariable("id") int id)
	{
		serv.deletematrix(id);
		return "Matrix with id "+id+" is deleted";
	}
	
	//delete mapping using request param
	@DeleteMapping("/byReqParm")
	public String removeByRequest(@RequestParam ("id") int id)
	{
		serv.deletematrix(id);
		return "Matrix with id "+id+" is deleted";
	}
	
	//if there is no id
	@DeleteMapping("/deletematrixif/{id}")
	public ResponseEntity<String> deleteMatrix(@PathVariable int id){
		boolean deleted = serv.deletematrixif(id);
		if(deleted) {
			return ResponseEntity.ok("Hotel with ID "+id+" deleted successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hotel with ID "+id+" not found");
		}
	}
	
	//getUserById
	@GetMapping("users/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable int userId)
	{
        Optional<matrixmodel> hotel = serv.getuserById(userId);
		if(hotel != null) {
			return ResponseEntity.ok(hotel);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(hotel);
	}

}
