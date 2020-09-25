package Mindera;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrdersAnalyzer {

	public Map<DayOfWeek, Integer> averageDailySales(List<Order> orders) {

		for (int i = 0; i < orders.size(); i++) {
			System.out.print(orders.get(i).cretionDate.getDayOfWeek());
			// System.out.print(orders.get(i).orderlines.add(new OrderLine()));
		}

		// OrdersAnalyzer.Order.orderId = 1;

		return new HashMap<DayOfWeek, Integer>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// OuterClass outerObject = new OuterClass();
		// OuterClass.InnerClass innerObject = outerObject.new InnerClass();

		OrderLine ol1 = new OrderLine(1, "line 1", 1, new BigDecimal("1.0987654321"));
		OrderLine ol2 = new OrderLine(2, "line 2", 1, new BigDecimal("2.0987654321"));
		OrderLine ol3 = new OrderLine(3, "line 3", 1, new BigDecimal("3.0987654321"));
		OrderLine ol4 = new OrderLine(4, "line 4", 1, new BigDecimal("4.0987654321"));
		List<OrderLine> orderlines1 = new ArrayList<OrderLine>();
		orderlines1.add(ol1); orderlines1.add(ol2); orderlines1.add(ol3); orderlines1.add(ol4);
		
		OrderLine ol5 = new OrderLine(5, "line 1", 1, new BigDecimal("1.0987654321"));
		OrderLine ol6 = new OrderLine(6, "line 2", 1, new BigDecimal("2.0987654321"));
		OrderLine ol7 = new OrderLine(7, "line 3", 1, new BigDecimal("3.0987654321"));
		OrderLine ol8 = new OrderLine(8, "line 4", 1, new BigDecimal("4.0987654321"));

		List<OrderLine> orderlines2 = new ArrayList<OrderLine>();
		orderlines2.add(ol5); orderlines2.add(ol6); orderlines2.add(ol7); orderlines2.add(ol8); 
		
		OrderLine ol9 = new OrderLine(9, "line 1", 1, new BigDecimal("1.0987654321"));
		OrderLine ol10 = new OrderLine(10, "line 2", 1, new BigDecimal("2.0987654321"));
		OrderLine ol11 = new OrderLine(11, "line 3", 1, new BigDecimal("3.0987654321"));
		OrderLine ol12 = new OrderLine(12, "line 4", 1, new BigDecimal("4.0987654321"));
		List<OrderLine> orderlines3 = new ArrayList<OrderLine>();
		 orderlines3.add(ol9); orderlines3.add(ol10); orderlines3.add(ol11); orderlines3.add(ol12);
		
		OrderLine ol13 = new OrderLine(13, "line 1", 1, new BigDecimal("1.0987654321"));
		OrderLine ol14 = new OrderLine(14, "line 2", 1, new BigDecimal("2.0987654321"));
		OrderLine ol15 = new OrderLine(15, "line 3", 1, new BigDecimal("3.0987654321"));
		OrderLine ol16 = new OrderLine(16, "line 4", 1, new BigDecimal("4.0987654321"));
		List<OrderLine> orderlines4 = new ArrayList<OrderLine>();
		orderlines4.add(ol13); orderlines4.add(ol4); orderlines4.add(ol5); orderlines4.add(ol6);
		

		Order o1 = new Order(1, LocalDateTime.now(), orderlines1);
		Order o2 = new Order(2, LocalDateTime.now(), orderlines2);
		Order o3 = new Order(3, LocalDateTime.now(), orderlines3);
		Order o4 = new Order(4, LocalDateTime.now(), orderlines4);
		List<Order> orders = new ArrayList<Order>();
		orders.add(o1); orders.add(o2); orders.add(o3); orders.add(o4);
		// OrdersAnalyzer.Order order = oa.new Order();
		
	//	for(Order order: orders)
	//		System.out.print(order.toString());

		/*
		for(int i=0; i<orders.size(); i++)
			for(int j=0; j<orders.get(i).orderlines.size(); j++)
			{
				System.out.print(""+(orders.get(i).orderlines.get(j).quantity)*(orders.get(i).orderlines.get(j).unitPrice));
				
			}
*/
		
	}
}
