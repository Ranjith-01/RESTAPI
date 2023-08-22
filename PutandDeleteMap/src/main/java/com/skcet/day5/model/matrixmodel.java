package com.skcet.day5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class matrixmodel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int humans;
    @Column(name="humanname")
    private String names;
    public String lifetime;
	public int getHumans() {
		return humans;
	}
	public void setHumans(int humans) {
		this.humans = humans;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getLifetime() {
		return lifetime;
	}
	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}
    
	
	
}
