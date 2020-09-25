package Java8;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Item {

	private String name;
	private int qty;
	private BigDecimal price;

	private LocalDateTime timePurchase;

	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public Item(String name, int qty, BigDecimal price, LocalDateTime timePurchase) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.timePurchase = timePurchase;
	}

	public String getName() {
		return name;
	}

	public LocalDateTime getPurchaseTime() {
		return timePurchase;
	}

	public DayOfWeek getPurchaseDayOfWeek() {
		return timePurchase.getDayOfWeek();
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String toString() {

		return "Name: " + getName() + " Quantity: " + getQty() + " Purchase Time: " + getPurchaseTime();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 apple, 2 banana, others 1
		List<Item> items = Arrays.asList(
				new Item("apple", 10, new BigDecimal("9.99"), LocalDateTime.of(2020, Month.AUGUST, 19, 19, 30, 40)),
				new Item("banana", 20, new BigDecimal("19.99"), LocalDateTime.of(2020, Month.AUGUST, 20, 19, 30, 40)),
				new Item("orang", 10, new BigDecimal("29.99"), LocalDateTime.of(2020, Month.AUGUST, 21, 19, 30, 40)),
				new Item("watermelon", 10, new BigDecimal("29.99"),
						LocalDateTime.of(2020, Month.AUGUST, 22, 19, 30, 40)),
				new Item("papaya", 20, new BigDecimal("9.99"), LocalDateTime.of(2020, Month.AUGUST, 23, 19, 30, 40)),
				new Item("apple", 10, new BigDecimal("9.99"), LocalDateTime.of(2020, Month.AUGUST, 24, 19, 30, 40)),
				new Item("banana", 10, new BigDecimal("19.99"), LocalDateTime.of(2020, Month.AUGUST, 25, 19, 30, 40)),
				new Item("apple", 20, new BigDecimal("9.99"), LocalDateTime.of(2020, Month.AUGUST, 26, 19, 30, 40)));

		// private LocalDateTime timePurchase; // = LocalDateTime.of(2020, Month.AUGUST,
		// 29, 19, 30, 40); // Output: 2020-07-29T19:30:40

		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));

		// System.out.println("Group by + Count: "+counting);

		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, (Collectors.summingInt(Item::getQty)))); // +Item::getPrice

		Map<DayOfWeek, Double> averageQtyByDate = items.stream()
				.collect(Collectors.groupingBy(Item::getPurchaseDayOfWeek, Collectors.averagingInt(Item::getQty)));

		System.out.println("Goup by Items count: ");
		System.out.println(counting);
		
		System.out.println("Goup by Quantity per Item: ");
		System.out.println(sum);

		System.out.println("Goup by averageQtyByDate: ");
		System.out.println(averageQtyByDate);

	
		///////////////////////// VIP
		// https://vallur.github.io/blog/Frequency-sum-average-mapreduce/

	}

}
