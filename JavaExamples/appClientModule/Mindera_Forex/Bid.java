package Mindera_Forex;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Bid {
	
	private final BigDecimal exchangeRate;
	private final ZonedDateTime quoteTime;
	
	public Bid(BigDecimal exchangeRate, ZonedDateTime quoteTime) {
		this.exchangeRate = exchangeRate;
		this.quoteTime = quoteTime;
	}


	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}


	public ZonedDateTime getQuoteTime() {
		return quoteTime;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
