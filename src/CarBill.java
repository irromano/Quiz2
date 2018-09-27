// Class which calculates car payments
// Class which calculates car payments
public class CarBill {

	private double carCost; 		// in cents
	private double downPayment;
	private double months;
	private double apr;

	public CarBill(double carCost, double downPayment, double months, double apr) {
		this.carCost = carCost;
		this.downPayment = downPayment;
		this.months = months;
		this.apr = apr;
	}
	
	public double getCarPayment() {
		
		double payment = (carCost - downPayment) * ((apr/12 * Math.pow(1 + apr/12, months)) / (Math.pow(1+ apr/12, months) - 1));
		
		return payment;
	}

	public double getTotalInterest() {
		double totalInterest = getCarPayment() * months - (carCost - downPayment);
		return totalInterest;
	}
}
