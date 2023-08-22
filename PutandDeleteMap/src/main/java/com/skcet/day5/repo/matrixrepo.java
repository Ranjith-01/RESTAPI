package com.skcet.day5.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day5.model.matrixmodel;

public interface matrixrepo extends JpaRepository<matrixmodel, Integer >{

}
