package com.maria.example;

public class SalesTaxes {
	

  public static void main(String[] args) {
    
  	/*
  	 * INPUT:  
  	 * 
  	 * Input 1:  
  	 * 1 book at 12.49  
  	 * 1 music CD at 14.99  
  	 * 1 chocolate bar at 0.85  
  	 * 
  	 * Input 2:  
  	 * 1 imported box of chocolates at 10.00  
  	 * 1 imported bottle of perfume at 47.50  
  	 * 
  	 * Input 3:  
  	 * 1 imported bottle of perfume at 27.99  
  	 * 1 bottle of perfume at 18.99  
  	 * 1 packet of headache pills at 9.75  
  	 * 1 box of imported chocolates at 11.25  
  	 * 
  	 */
  	
  	// Input 1
  	Product[] productsInput1 = {
  			new Product("book", Product.BOOKS, 12.49, Product.LOCAL, 1), 
  			new Product("music CD", Product.MUSICALS, 14.99, Product.LOCAL, 1), 
  			new Product("chocolate bar", Product.FOODS, 0.85, Product.LOCAL, 1)};
  	
  	// Input 2
  	Product[] productsInput2 = {
  			new Product("box of chocolates", Product.FOODS, 10.00, Product.IMPORTED, 1),
  			new Product("bottle of perfume", Product.COSMETICS, 47.50, Product.IMPORTED, 1)  			
  	};
  	
  	// Input 3
  	Product[] productsInput3 = {
  			new Product("bottle of perfume", Product.COSMETICS, 27.99, Product.IMPORTED, 1),
  			new Product("bottle of perfume", Product.COSMETICS, 18.99, Product.LOCAL, 1),
  			new Product("packet of headache pills", Product.MEDICAL, 9.75, Product.LOCAL, 1),
  			new Product("box of imported chocolates", Product.FOODS, 11.25, Product.IMPORTED, 1)
  	};
  	
  	// Creating shopping baskets
  	ShoppingBasket[] shoppingBaskets = {
  			new ShoppingBasket(productsInput1),
  			new ShoppingBasket(productsInput2), 
  			new ShoppingBasket(productsInput3)
  	};
  	
  	// Printing outputs
  	for(int i = 0; i < 3; i++) {
  		System.out.println("OUTPUT " + (i+1) + ":");
  		shoppingBaskets[i].printReceipt();
  		System.out.println();
  	}
  
    /*
     * OUTPUT  
     * 
     * Output 1:  
     * 1 book : 12.49  
     * 1 music CD: 16.49  
     * 1 chocolate bar: 0.85  
     * Sales Taxes: 1.50  
     * Total: 29.83
     *   
     * Output 2:  
     * 1 imported box of chocolates: 10.50  
     * 1 imported bottle of perfume: 54.65  
     * Sales Taxes: 7.65  
     * Total: 65.15 
     * 
     * Output 3:  
     * 1 imported bottle of perfume: 32.19  
     * 1 bottle of perfume: 20.89  
     * 1 packet of headache pills: 9.75  
     * 1 imported box of chocolates: 11.85  
     * Sales Taxes: 6.70  
     * Total: 74.68 
     */
   
  }
}
