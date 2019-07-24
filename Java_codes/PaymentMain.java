class Payment{
	double amount;
	Payment(double amount){
	  this.amount = amount;
		}

	void paymentDetails(){
	System.out.println("Hey User!! You need to make payment of Rs." + amount);
	}

}

class CashPayment extends Payment{
	
	CashPayment(double amount){
		super(amount);
		}
	void cashPaymentDetails(){
	System.out.println("Mode of Payment is: Cash");
		}
	}

class creditCardPayment extends CashPayment{
	String creditCardNumber;
	String nameOnCard;
	int cvv;
	String expiryDate;
	double ccnumber = Double.parseDouble(creditCardNumber);
	
	creditCardPayment(double amount,long creditCardNumber, String nameOnCard,int cvv,String expiryDate){
			super(amount);
			this.creditCardNumber = creditCardNumber;
			this.nameOnCard = nameOnCard;
			this.cvv = cvv;
			this.expiryDate = expiryDate;		
		}
	void check_length(){
	if (creditCardNumber.length >16 or creditCardNumber.length <16){
		System.out.println("invalid credit number");
		}	
	}
	void creditCardPaymentDetails(){
		System.out.println("-------Details-------");
		System.out.println("Amount to be paid:" + amount);
		System.out.println("creditCardNumber:" + creditCardNumber);
		System.out.println("name on card:" + nameOnCard);		
		System.out.println("cvv:" + cvv);
		System.out.println("expiryDate:" + expiryDate );						

			}
}

class PaymentMain{
	public static void main(String[] args){
	
	CashPayment cp = new CashPayment(10000);
	cp.cashPaymentDetails();

	creditCardPayment ccp = new creditCardPayment(1412,"1425632145754865","Avishake Dutta",544,"14-aug-2015");
	ccp.creditCardPaymentDetails();
	ccp.check_length();
	
	}
}
	
