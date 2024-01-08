package exceptionHandling;

class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		this.currency = currency;
		this.amount = amount;
	}
	
	public void add(Amount that) throws CurrenciesDoNotMatchException{
		if(!this.currency.equals(that.currency)) {
//			throw new RuntimeException("Currency Mismatch"); // UncheckedException
//			throw new Exception("Currency mismatch" + " " + this.currency+ " & " + that.currency);		// checkedException
			throw new CurrenciesDoNotMatchException("Currency mismatch" + " " + this.currency+ " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
	
	public String toString() {
		return amount + " " + currency;
	}
}

class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
}

public class ThrowingExceptionRunner {
	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("INR", 20);
		
		amount1.add(amount2);
		
		System.out.println(amount1);
		
	}
}
