package com.simpilearn.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name =  "orderdetails", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class OrderDetails {


	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	
	private String email;
	
	@Column(name = "details")
	private String details;
	
	@Column(name = "NumberOfItems")
	private int NumberOfItems;
	
	@Column(name = "totalAmount")
	private int totalAmount;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public int getNumberOfItems() {
		return NumberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		NumberOfItems = numberOfItems;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	
}
