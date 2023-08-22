package com.example.demo.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day4.Room;
import com.example.demo.repository.Roomrepository;

@Service
public class Roomservice {
	@Autowired
	Roomrepository frepo;
	
	public Room saveDetails(Room r) {
		return frepo.save(r);
	}
	public List<Room> getDetails(){
		return frepo.findAll();
	}

}
//package com.example.day4.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.day4.model.PetrolBunk;
//import com.example.day4.repository.fuelRep;
//
//@Service
//public class FuelService {
//	@Autowired
//	fuelRep frepo;
//	
//	public PetrolBunk saveDetails(PetrolBunk p)
//	{
//		return frepo.save(p);
//	}
//	
//	public List<PetrolBunk> getDetails()
//	{
//		return frepo.findAll();
//	}
//}