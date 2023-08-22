package com.example.demo.control;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day4.Room;
import com.example.demo.service.Roomservice;

@RestController
public class Roomcontrol {
	@Autowired
	Roomservice fser;
	@PostMapping("/saveRoom")
	public Room saveRoommates(@RequestBody Room rr)
	{
		return fser.saveDetails(rr);
	}
	@GetMapping("/getRoom")
	public List<Room> getRoommates()
	{
		return fser.getDetails();
	}

}
