package hw1;

public class FuelCoust {

	public static void main(String[] args) {

		double priceFuel = 1.2;
	    double consumptionFuel = 8;
	    double distance = 120;
	    
	    double totalFuel = (consumptionFuel / 100) * distance;
	    double totalCost = totalFuel * priceFuel;
	    
	    System.out.println("Стоимость топлива за поездку: " + totalCost + " $");


	}

}
