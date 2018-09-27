

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
public class CarBillTest {

	@Test
	public void getCarPayment_Test1() {
		CarBill bill1 = new CarBill(6000, 1000, 36, 0.1200);
		double payment = bill1.getCarPayment();
		System.out.println(payment);
		assertTrue(payment >= 166.07 &&payment <= 166.0799999);
	}
	@Test
	public void getTotalInterest_Test1() {
		CarBill bill1 = new CarBill(6000, 1000, 36, 0.1200);
		double interest = bill1.getTotalInterest();
		System.out.println(interest);
		assertTrue(interest >= 978.0 && interest <= 978.9);
	}

}
