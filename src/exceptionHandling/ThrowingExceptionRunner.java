package exceptionHandling;

class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount that) throws Exception{
		if(!this.currency.equals(that.currency)) {
//			throw new RuntimeException("Currency Mismatch"); // UncheckedException
			throw new Exception("Currency mismatch" + " " + this.currency+ " & " + that.currency);		// checkedException
		}
		this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws Exception {
	
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("INR", 20);
		
		amount1.add(amount2);
		
		System.out.println(amount1);
		
	}
}
