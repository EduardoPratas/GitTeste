package Mindera_Forex;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Currency;

public class Money {

	private final BigDecimal amount;
	private final Currency currency;

	public Money(BigDecimal amount, Currency currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
