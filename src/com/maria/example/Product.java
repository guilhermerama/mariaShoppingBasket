package com.maria.example;


public class Product {

	public static final int BOOKS = 0;
	public static final int FOODS = 1;
	public static final int MEDICAL = 2;
	public static final int COSMETICS = 3;
	public static final int MUSICALS = 4;
	
	public static final boolean IMPORTED = true;
	public static final boolean LOCAL = false;
  
	// product name
	private String name;
  // product categories: books, foods, medical, cosmetics or musicals
  private int category;
  // product sales value before taxing
  private double value;
  // product origin: imported (true) or local (false)
  private boolean imported;
  // product tax
  private double tax;
  // product amount
  private int amount;
  
	// class constructor
	public Product(String name, int category, double value, boolean imported, int amount) {
		this.name = name;
		this.category = category;
		this.value = value;
		this.imported = imported;
		this.amount = amount;
	}
	  
	public String getName() {
	  return this.name;
	}
	
	public void setName(String name) {
	  this.name = name;
	}
	
	public int getCategory() {
	  return this.category;
	}
	
	public void setCategory(int category) {
	  this.category = category;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public boolean isImported() {
		return this.imported;
	}
	
	//public boolean isImported() {
	//	return this.name != null ? name.contains("imported") : false;
	//}
	
	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
  
}
