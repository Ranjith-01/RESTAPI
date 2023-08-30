package com.skcet.com.model;

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
		public String getNameofVegetable() {
			return nameofVegetable;
		}
		public void setNameofVegetable(String nameofVegetable) {
			this.nameofVegetable = nameofVegetable;
		}
		public int getLifeOfVegetable() {
			return lifeOfVegetable;
		}
		public void setLifeOfVegetable(int lifeOfVegetable) {
			this.lifeOfVegetable = lifeOfVegetable;
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
		public int getRatingOfVegetable() {
			return ratingOfVegetable;
		}
		public void setRatingOfVegetable(int ratingOfVegetable) {
			this.ratingOfVegetable = ratingOfVegetable;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		
}
