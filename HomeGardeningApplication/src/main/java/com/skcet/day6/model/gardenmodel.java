package com.skcet.day6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class gardenmodel {
        @Id
        @GeneratedValue (strategy = GenerationType.IDENTITY)
	    private int id;
	    private String nameofVegetable;
	    private int lifeOfVegetable;
	    private String vitamins;
		private int orderId;
		private String contact;
		private int ratingOfVegetable;
		private String comments;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameofVegitable() {
			return nameofVegetable;
		}
		public void setNameofVegitable(String nameofVegitable) {
			this.nameofVegetable = nameofVegitable;
		}
		public int getLifeOfVegitable() {
			return lifeOfVegetable;
		}
		public void setLifeOfVegitable(int lifeOfVegitable) {
			this.lifeOfVegetable = lifeOfVegitable;
		}
		public String getVitamins() {
			return vitamins;
		}
		public void setVitamins(String vitamins) {
			this.vitamins = vitamins;
		}
		public int getOrderId() {
			return orderId;
		}
		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}
		public String getContact() {
			return contact;
		}
		public void setContact(String contact) {
			this.contact = contact;
		}
		public int getRatingOfVegitable() {
			return ratingOfVegetable;
		}
		public void setRatingOfVegitable(int ratingOfVegitable) {
			this.ratingOfVegetable = ratingOfVegitable;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		
}