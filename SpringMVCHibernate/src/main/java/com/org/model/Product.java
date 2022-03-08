package com.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Country table in database
 */
@Entity
@Table(name="product")
public class Product{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="productName")
	String productName;	
	
	@Column(name="qty")
	long qty;
	
	public Product() {
		super();
	}
	public Product(int i, String productName,long qty) {
		super();
		this.id = i;
		this.productName = productName;
		this.qty=qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getQty() {
		return qty;
	}
	public void setQty(long qty) {
		this.qty = qty;
	}	
	
}