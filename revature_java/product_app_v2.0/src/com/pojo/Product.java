package com.pojo;

public class Product {
private int pid;
private String name;
private double price;
private float ratings;
private String manufacturer_name;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int pid, String name, double price, float ratings, String manufacturer_name) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
	this.ratings = ratings;
	this.manufacturer_name = manufacturer_name;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
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
public String getManufacturer_name() {
	return manufacturer_name;
}
public void setManufacturer_name(String manufacturer_name) {
	this.manufacturer_name = manufacturer_name;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", ratings=" + ratings
			+ ", manufacturer_name=" + manufacturer_name + "]";
}

}
