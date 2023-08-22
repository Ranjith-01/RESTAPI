package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;




import com.example.demo.day4.Room;

public interface Roomrepository extends JpaRepository<Room, Integer> {

}
//package com.example.day4.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//
//import com.example.day4.model.PetrolBunk;
//
//
//public interface fuelRep extends JpaRepository<PetrolBunk, Integer> {
//
//}