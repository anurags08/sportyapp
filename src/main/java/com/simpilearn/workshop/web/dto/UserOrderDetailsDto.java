package com.simpilearn.workshop.web.dto;

public class UserOrderDetailsDto {
	
	
	private String email;
	private String details;
	
	private int NumberOfItems;
	
	private int totalAmount;

	
	public UserOrderDetailsDto(String email, String details, int numberOfItems, int totalAmount) {
		super();
		this.email = email;
		this.details = details;
		NumberOfItems = numberOfItems;
		this.totalAmount = totalAmount;
	}

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