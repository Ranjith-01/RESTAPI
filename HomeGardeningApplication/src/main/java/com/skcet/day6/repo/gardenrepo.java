package com.skcet.day6.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skcet.day6.model.gardenmodel;

import jakarta.transaction.Transactional;
@Repository
public interface gardenrepo extends JpaRepository<gardenmodel, Integer>{
	@Query(value = "select * from gardenmodel",nativeQuery = true)
	public List<gardenmodel> getRows();

	@Query(value = "select * from gardenmodel where contact =:add and comments =:name",nativeQuery = true)
	public List<gardenmodel> getSpecRows(@Param("add") String addr,@Param("name") String name);
		
	//get by character
	@Query(value = "select * from gardenmodel where nameof_vegetable like %?1%",nativeQuery = true)
	public List<gardenmodel> getByChar(@Param("nameof_vegetable") String name);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value = "delete from gardenmodel where id=:id",nativeQuery = true)
	public int delete(@Param("id") int id);
	
		
	@Modifying
	@Transactional
	@Query(value = "update gerdenmodel set contact=:addr where id=:id",nativeQuery = true)
	public int updateValueById(@Param("addr") String addr,@Param("id") int id); 
	
	//get by using model class
	@Query("select g from gardenmodel g")
	public List<gardenmodel> getting();

		    
   //get using id by model class
	@Query("select g from gardenmodel g where g.contact =:addr and vitamins =:name")
	public List<gardenmodel> getSpecRowByModelValue(@Param("addr") String addr,@Param("name") String name);
	    
    //delete by name using model
	@Modifying
	@Transactional
	@Query("delete from gardenmodel g where g.id=:id")
	public int deleteModelValue(@Param("id") int id);
	
    @Modifying
    @Transactional
    @Query("update gardenmodel g set g.contact=:addr where g.id=:id")
    public int updateModelByValue(@Param("addr") String addr,@Param("id") int no_id);
		;


}