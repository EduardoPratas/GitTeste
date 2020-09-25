package Mindera;

import java.time.LocalDateTime;
import java.util.List;



public class Order {
	
			public Order(int orderId, LocalDateTime cretionDate, List<OrderLine> orderlines) {
				super();
				this.orderId = orderId;
				this.cretionDate = cretionDate;
				this.orderlines = orderlines;
			}
			int orderId;
			LocalDateTime cretionDate;
			List<OrderLine> orderlines;
		
			public String toString() {
				
				return "\norderId: "+orderId+"\n"+orderlines.toString();
				
			}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
