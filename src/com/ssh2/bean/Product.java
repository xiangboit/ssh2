package com.ssh2.bean;

import java.util.Date;

public class Product {
	private int id;
	private String name;
	private Date productDate;
	private Orders orders;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getProductDate() {
		return productDate;
	}
	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", productDate="
				+ productDate + "]";
	}
	
	
}
