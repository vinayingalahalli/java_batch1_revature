package com.search.model;

import java.util.Date;

public class Product {
private int id;
private String name;
private double price;
private float ratings;
private Date manufactured_date;
private Manufacturer manufacturer;



public Product() {
	// TODO Auto-generated constructor stub
}



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



public double getPrice() {
	return price;
}



public void setPrice(double price) {
	this.price = price;
}



public float getRatings() {
	return ratings;
}



public void setRatings(float ratings) {
	this.ratings = ratings;
}



public Date getManufactured_date() {
	return manufactured_date;
}



public void setManufactured_date(Date manufactured_date) {
	this.manufactured_date = manufactured_date;
}



public Manufacturer getManufacturer() {
	return manufacturer;
}



public void setManufacturer(Manufacturer manufacturer) {
	this.manufacturer = manufacturer;
}



public Product(int id, String name, double price, float ratings, Date manufactured_date, Manufacturer manufacturer) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.ratings = ratings;
	this.manufactured_date = manufactured_date;
	this.manufacturer = manufacturer;
}



@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", ratings=" + ratings + ", manufactured_date="
			+ manufactured_date + ", manufacturer=" + manufacturer + "]";
}



}
