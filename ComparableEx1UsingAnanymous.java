package com.cg.may10.Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparableEx1UsingAnanymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(101,"Boat earphones",2000,3.9f);
		Product p2=new Product(102,"MIVI headphones",1000,4.9f);
		Product p3=new Product(103,"Redmi headphones",1500,4.4f);
		Product p4=new Product(104,"Alexa",3000,4.5f);
		Product p5=new Product(105,"Marshall headphones",5000,4.1f);
		Product p6=new Product(106,"Apple airpods",18000,4.4f);
		
		ArrayList<Product> prodList=new ArrayList<Product>();
		
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);
		prodList.add(p5);
		prodList.add(p6);
		System.out.println("--Before sorting--");
		System.out.println(prodList);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Sort by price\n 2. sort by ratings \n 3.sort by Name \n 0.To Sort All \n");
		System.out.println("Enter the  choice ");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			Collections.sort(prodList);
			break;
		case 2:
			/*
			Comparator<Product> CompareByRatings = new Comparator<Product>() {
				
				@Override
				public int compare(Product p1, Product p2) {
					
					return p1.getRatings()>p2.getRatings()? -1 : 1;
				}
			};
			
			Collections.sort(prodList,CompareByRatings);
			break;
			
			*/
			Collections.sort(prodList,new Comparator<Product>() {
				
				@Override
				public int compare(Product p1, Product p2) {
					
					return p1.getRatings()>p2.getRatings()? -1 : 1;
				}});
			break;
			
		case 3:
			/*
			Comparator<Product> CompareByProductName = new Comparator<Product>() {
				
				@Override
				public int compare(Product p1, Product p2) {
					
					int r=p1.getProductName().compareTo(p2.getProductName());
					return r;
				}
			};
			Collections.sort(prodList,CompareByProductName);
			break;
			*/
			
			Collections.sort(prodList,new Comparator<Product>() {
				
				@Override
				public int compare(Product p1, Product p2) {
					
					int r=p1.getProductName().compareTo(p2.getProductName());
					return r;
				}
			});
			break;
		}
		System.out.println(prodList);	
	}
}

class CompareByRatings implements Comparator<Product>{
	public int compare(Product p1,Product p2)
	{
		return 0;
	}
}
class CompareByProductName implements Comparator<Product>{
	public int compare(Product p1,Product p2) {
		return 0;
	}
}