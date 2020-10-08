package com.maria.example;

import java.util.*;

public class ShoppingBasket {
	
	// shopping basket products
	private Product[] products;
	// shopping basket total value
	private double basketValue;
	// shopping taxes total value
	private double basketTaxesValue;
  
	// class constructor
	public ShoppingBasket(Product[] products) {
		
		// creating shopping basket
		this.products = new Product[products.length];
		
	  for(int i = 0; i < products.length; i++) {
	  	this.products[i] = products[i];
	  	// calculating and saving total taxes value
	  	this.basketTaxesValue = this.basketTaxesValue + productTaxes(products[i]);
	    // adding all products values
	  	this.basketValue = this.basketValue + (products[i].getValue() * products[i].getAmount());
	  }
	  
	  // calculating total basket value: products values + taxes
	  this.basketValue = this.basketValue + this.basketTaxesValue;
	}
	
	// printing receipt method
	public void printReceipt() {
		
		// printing each basket product
		for(int i = 0; i < this.products.length; i++) {
			// printing product amount
			System.out.print(this.products[i].getAmount() + " ");
			
			// printing if product is imported
			if(this.products[i].isImported()) {
				System.out.print("imported ");
			}
			
			// printing product name and value
			System.out.println(this.products[i].getName() + " " + 
			  String.format(new Locale("en"), "%.2f", (this.products[i].getValue() + this.products[i].getTax())));
		}
		// printing sales taxes
		System.out.println("Sales Taxes: " + 
		  String.format(new Locale("en"), "%.2f", this.basketTaxesValue));
		// printing total basket value: products and taxes
		System.out.println("Total: " + 
		  String.format(new Locale("en"), "%.2f", this.basketValue));
	}
	
	// method to calculate product tax
	public double productTaxes(Product product) {
		
		double tax = 0.0;
		// if the product isn't a book, food or medical goods it's taxed by 10%
		if((product.getCategory() != Product.BOOKS) &&
				(product.getCategory() != Product.FOODS) && 
				(product.getCategory() != Product.MEDICAL)) {
			tax = 10;
		} 
		// if the product is imported an additional tax of 5% is added
		if(product.isImported()) {
			tax = tax + 5; 
		} 
		// calculating tax
		tax = this.taxesCalculus((product.getValue() * product.getAmount()), tax);
		// setting product calculated tax 
		product.setTax(tax);
		return tax;
	}
	
	private double taxesCalculus(double productValue, double tax) {
		
	  double taxValue = 0.0;
		// calculating tax product value
	  taxValue = (productValue * tax) / 100;
		// rounding taxedValue
	  taxValue = Math.round(taxValue * 20) / 20.0;
	  // returning the calculated tax value
		return taxValue;
	}
	
	public double getBasketTaxesValue() {
		return this.basketTaxesValue;
	}
	
	public double getBasketValue() {
		return this.basketValue;
	}
	
	public Product getProduct(int i) {
		return this.products[i];
	}
	
	public void setProduct(Product product, int i) {
		this.products[i] = product;
	}

}
