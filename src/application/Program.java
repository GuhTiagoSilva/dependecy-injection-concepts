package application;

import services.PayService;

public class Program {

	public static void main(String[] args) {
		PayService payService = new PayService();
		double finalPrice = payService.finalPrice(300.0, "SC");
		System.out.println("Result = " + finalPrice);
	}

}
