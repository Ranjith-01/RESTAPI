package com.skcet.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.model.gardenmodel;

public interface gardenrepo extends JpaRepository<gardenmodel, Integer>{

}