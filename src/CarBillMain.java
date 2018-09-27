import java.util.Scanner; //
public class CarBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdin = new Scanner(System.in);
		System.out.printf("Please enter car cost: %n%n");
		double carCost = stdin.nextDouble();
		System.out.printf("Please enter car down payment: %n%n");
		double downPayment = stdin.nextDouble();
		System.out.printf("Please enter months of loan term: %n%n");
		double months = stdin.nextDouble();
		System.out.printf("Please enter loan apr: %n%n");
		double apr = (stdin.nextDouble() / 100);
		
		CarBill bill = new CarBill(carCost, downPayment, months, apr);
		
		System.out.printf("Your monthly payments are: %.2f%n", bill.getCarPayment());
		System.out.printf("The total interest you'll pay over the course of the loan: %.2f%n", bill.getTotalInterest());
		
		
	}

}
