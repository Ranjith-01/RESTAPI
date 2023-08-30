package com.skcet.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day6.model.Users;

public interface Userrepo extends JpaRepository<Users, Integer> {

}
