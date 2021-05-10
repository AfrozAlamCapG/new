package com.cg.may10.Task2;

public class Product implements Comparable<Product> {
private int productId;
private String productName;
private float price;
private float ratings;
public Product(int productId, String productName, float price, float ratings) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.price = price;
	this.ratings = ratings;
}
public int getProductId() {
	return productId;
}
public String getProductName() {
	return productName;
}
public float getPrice() {
	return price;
}
public float getRatings() {
	return ratings;
}
public String toString()
{
	return "Id: "+productId+" "+" || product name: "+productName+" || price: "+price+" || ratings: "+ratings+"||"+"\n";
}
@Override
public int compareTo(Product p) {
	//System.out.println("comparing "+this.productName+"with "+p.productName);
	//System.out.println("***********Compare to called**********");
	//compare process in work
	// TODO Auto-generated method stub
	if(this.price<p.price)
		return -1;
	else
		return 0;
}
}
