package Examples;

import java.util.HashMap;

// ***************************************************************
//  Uses the class lot and add them to a HashMap ParkingLot 
//  The HashMap key is the lot number
//***************************************************************
public class ParkingLot {
	String description = "";

	static HashMap<String, Lot> parquingLot = new HashMap<String, Lot>();

	public static void fillLot(String lotCode, Lot lot) {
		parquingLot.put(lotCode, lot);
	}

	public static void emptyLot(String lotCode) {
		parquingLot.remove(lotCode);
	}

	// -------------------------------------------------------
	// Return a string with the ParkingLot information
	// -------------------------------------------------------
	@Override
	public String toString() {
		parquingLot.forEach((k, v) -> {
			description += "Lot code: " + k + " Slot Type: " + v.lotType + " Is Occupied: " + v.isOccupied + "\n";
		});
		return description;
	}

	// -------------------------------------------------------
	// Class Lot.
	// -------------------------------------------------------
	public static class Lot {
		private boolean isOccupied;
		private String lotCode; // A1; B2
		private char lotType; // C-car; B-Bus; M-Motorcycle

		// -------------------------------------------------------
		// Create a new Slot with the given attributes.
		// -------------------------------------------------------
		public Lot(String lotCode, char lotType, boolean isOccupied) {
			this.isOccupied = isOccupied;
			this.lotCode = lotCode;
			this.lotType = lotType;
		}

		// -------------------------------------------------
		// Checks if occupied
		// -------------------------------------------------
		public boolean isOccupied() {
			return isOccupied;
		}

		// -------------------------------------------------
		// Returns the code of the Slot
		// -------------------------------------------------
		public String getLotCode() {
			return lotCode;
		}

		// -------------------------------------------------
		// Returns the Slot type
		// -------------------------------------------------
		public int getSlotType() {
			return lotType;
		}

		// -------------------------------------------------
		// @Override equals
		// -------------------------------------------------
		@Override
		public boolean equals(Object o) {
			return (((Lot) o).lotCode == this.lotCode);
		}

	}

	public static void main(String[] args) {

		ParkingLot parkingLot = new ParkingLot();

		ParkingLot.Lot lot1 = new Lot("A1", 'C', true);
		ParkingLot.Lot lot2 = new Lot("A2", 'C', true);
		ParkingLot.Lot lot3 = new Lot("A3", 'C', true);

		ParkingLot.fillLot(lot1.lotCode, lot1);
		ParkingLot.fillLot(lot2.lotCode, lot2);
		ParkingLot.fillLot(lot3.lotCode, lot3);
		
		parkingLot.emptyLot("A1");

		System.out.println("" + parkingLot);

	}
}
