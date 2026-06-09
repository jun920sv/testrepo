package print14.Question03;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public void pay(int i) {
		System.out.printf("クレジットカードで%d円の支払い\n",i);
		
	}

}
