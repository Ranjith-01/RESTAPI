package com.skcet.day6.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.model.transientmodel;

public interface transientrepo extends JpaRepository<transientmodel, Integer>{

}
