package print14.Question03;

public class PaymentContext {
	PaymentStrategy strategy;

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void executePayment(int i) {
		this.strategy.pay(i);
	}

}
