package com.skcet.day6.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class gardenmodel {
        @Id
	    private int id;
	    private String nameofVegitable;
	    private int lifeOfVegitable;
	    private String vitamins;
		private int orderId;
		private String contact;
		private int ratingOfVegitable;
		private String comments;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNameofVegitable() {
			return nameofVegitable;
		}
		public void setNameofVegitable(String nameofVegitable) {
			this.nameofVegitable = nameofVegitable;
		}
		public int getLifeOfVegitable() {
			return lifeOfVegitable;
		}
		public void setLifeOfVegitable(int lifeOfVegitable) {
			this.lifeOfVegitable = lifeOfVegitable;
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
			return ratingOfVegitable;
		}
		public void setRatingOfVegitable(int ratingOfVegitable) {
			this.ratingOfVegitable = ratingOfVegitable;
		}
		public String getComments() {
			return comments;
		}
		public void setComments(String comments) {
			this.comments = comments;
		}
		
}