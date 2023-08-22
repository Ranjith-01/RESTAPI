package com.skcet.day5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

import com.skcet.day5.model.matrixmodel;
import com.skcet.day5.repo.matrixrepo;

@Service
public class matrixservice {
	@Autowired
	public matrixrepo mrepo;
	
	//post the data
	public String saveMatrix(matrixmodel m)
	{
		 mrepo.save(m);
		 return "Data is saved";
		
	}
	
	//get the data
    public List<matrixmodel> getMatrix()
	{
		 return mrepo.findAll();
			
	}
    // update the data
    public matrixmodel updatematrix (matrixmodel mm)
    {
    	return mrepo.saveAndFlush(mm);
    }
    //delete the data
    public void deletematrix(int humans) {
    	mrepo.deleteById(humans);
    }
    //delete data
    public boolean deletematrixif(int humans)
    {
    	if(mrepo.existsById(humans)) {
    		mrepo.deleteById(humans);
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //getUserId
    @GetMapping("/users/userId")
    
    public Optional<matrixmodel> getuserById(int userId)
    {
    	Optional<matrixmodel> hotel = mrepo.findById(userId);
    	if(hotel.isPresent()) {
    		return hotel;
    	}
    	else
    	{
    		return null;
    	}
    }

}
