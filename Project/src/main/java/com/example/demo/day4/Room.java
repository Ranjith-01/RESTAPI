package com.example.demo.day4;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Roommates")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int RollNo;
   @Column(name="Rommatename")
   private String Name;
   private String Batch;
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getBatch() {
	return Batch;
}
public void setBatch(String batch) {
	Batch = batch;
}
   
}
