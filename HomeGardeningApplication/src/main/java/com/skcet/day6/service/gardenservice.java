package com.skcet.day6.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import com.skcet.day6.model.gardenmodel;
import com.skcet.day6.repo.gardenrepo;

@Service
public class gardenservice {

	@Autowired
	public gardenrepo grepo;
	
	

	//post the data
	public String savegarden(gardenmodel m)
	{
		 grepo.save(m);
		 return "Data is saved";
		
	}
	
	//get the data
    public List<gardenmodel> getgarden()
	{
		 return grepo.findAll();
			
	}
    // update the data
    public gardenmodel updategarden (gardenmodel mm)
    {
    	return grepo.saveAndFlush(mm);
    }
    //delete the data
    public void deletegarden(int humans) {
    	grepo.deleteById(humans);
    }
    //delete data
    public boolean deletegardenif(int humans)
    {
    	if(grepo.existsById(humans)) {
    		grepo.deleteById(humans);
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //getUserId
    @GetMapping("/users/userId")
    
    public Optional<gardenmodel> getuserById(int userId)
    {
    	Optional<gardenmodel> home = grepo.findById(userId);
    	if(home.isPresent()) {
    		return home;
    	}
    	else
    	{
    		return null;
    	}
    }
    //sort by asc
    public List<gardenmodel> sortByAsc(String nameofVegitable)
    {
    	return grepo.findAll(Sort.by(nameofVegitable).ascending());
    }

    //sort by desc
    public List<gardenmodel> sortByDesc(String nameofVegitable)
    {
    	return grepo.findAll(Sort.by(nameofVegitable).descending());
    }
 	
    //paging
  	public List<gardenmodel> pagination(int no,int size)
  	{
  		Page<gardenmodel> count = grepo.findAll(PageRequest.of(no, size));
  		return count.getContent();
  	}
 	
 	//pagination and sorting
  	public List<gardenmodel> paginationAndSort(int no,int size,String nameofVegitable)
  	{
  		Page<gardenmodel> count1 = grepo.findAll(PageRequest.of(no, size, Sort.by(nameofVegitable)));
 		return count1.getContent();
  	}
  	 //get all data
 	public List<gardenmodel> getAllRows()
 	{
 		return grepo.getRows();
 	}
 	//get Spec data
 	public List<gardenmodel> getSpeceficrows(String addr,String name)
  	{
 		return grepo.getSpecRows(addr, name);
 		
 	}
	//get by Char
  	public List<gardenmodel> getByChar(String name)
 	{
  		return grepo.getByChar(name);
  	}
  	//delete the data
  	public int deleteValueById(int id)
 	{
 		return grepo.delete(id);
 	}
  	//update the data 
  	public int updateDataById(String addr,int no_id) {
 		return grepo.updateValueById(addr, no_id);
 	}
 	
 	//get using model class
 	public List<gardenmodel> gettingmodelValue()
 	{
  		return grepo.getting();
  		
  	}
 	 	
   // get specific data
     public List<gardenmodel> getSpecrowsmodelvalue(String addr,String name)
 	{
		return grepo.getSpecRowByModelValue(addr, name);
	}
 	
	//delete using model class
	public int deleteUsingmodelValue(int id)
	{
		return grepo.deleteModelValue(id);
	}
	//updete by model
	public int updateDatamodelByValue(String addr,int no_id)
	{
		return grepo.updateModelByValue(addr, no_id);
		
	}
    
}