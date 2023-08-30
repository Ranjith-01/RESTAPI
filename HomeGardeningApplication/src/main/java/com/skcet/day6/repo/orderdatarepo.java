package com.skcet.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.model.orderdata;

public interface orderdatarepo extends JpaRepository<orderdata, Integer>{

}
