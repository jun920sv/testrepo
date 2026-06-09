package print14.Question03;

public class Main {

public static void main(String[] args) {
		
		PaymentContext context = new PaymentContext();
		
		context.setStrategy(new CreditCardPayment());
		
		context.executePayment(1000);
		
		context.setStrategy(new PayPayPayment());
		
		context.executePayment(2000);
		
		}
		
	}
