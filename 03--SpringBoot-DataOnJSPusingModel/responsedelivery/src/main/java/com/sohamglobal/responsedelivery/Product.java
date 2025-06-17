package com.sohamglobal.responsedelivery;

public class Product {
	
	private String prodnm;
	private String company;
	private float price;
	
	public Product(String prodnm, String company, float price) {
		super();
		this.prodnm = prodnm;
		this.company = company;
		this.price = price;
	}
	
	public String getProdnm() {
		return prodnm;
	}
	public void setProdnm(String prodnm) {
		this.prodnm = prodnm;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
