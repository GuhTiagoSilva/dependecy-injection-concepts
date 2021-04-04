package services;

public class PayService {

	private TaxService taxService = new TaxService();
	private DeliverService deliverService = new DeliverService();

	public double finalPrice(double cost, String state) {
		return cost + deliverService.fee(state) + taxService.tax(cost);
	}
}
