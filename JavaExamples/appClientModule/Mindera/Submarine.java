package Mindera;

public class Submarine extends MarineShip {

	 public void go() {
	        System.out.println("Underwater");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        MarineShip submarine = new Submarine();
		        ((Submarine)submarine).go();
		   

	}

}
