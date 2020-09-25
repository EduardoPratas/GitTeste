package Mindera;

import java.math.BigDecimal;

public class OrderLine{
    public OrderLine(int productId, String name, int quantity, BigDecimal unitPrice) {
		super();
		this.productId = productId;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
	int productId;
	String name;
	int quantity;
	BigDecimal unitPrice;
	
	public String toString() {
		return "\nproductId: "+productId+" Name: "+name+ " Quantity: "+ quantity+ " unitPrice: "+unitPrice+"€";
		
	}


}