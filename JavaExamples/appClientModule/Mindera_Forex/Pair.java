package Mindera_Forex;

import java.util.Currency;
import java.util.Objects;

public class Pair {

	private final Currency from;
	private final Currency to;

	public Pair(Currency from, Currency to) {
		this.from = from;
		this.to = to;
	}

	public Currency getFrom() {
		return from;
	}

	public Currency getTo() {
		return to;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Pair pair = (Pair)obj;
		return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(from, to);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
