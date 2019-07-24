class Account{
	int accountId;
	String accountHolderName;
	double initialBalance;
	String accountType;
	static String bankName = "State Bank of India";
	
	Account(int accid,String accHolName, double iniBal, String accTyp){
		accountId = accid;
		accountHolderName =  accHolName ;
		initialBalance = iniBal;
		accountType = accTyp;
			}
	Account(int accid1,String accHolName1){
		accountId = accid1;
		accountHolderName =  accHolName1 ;
			}
	
	double getBalance(){
		return initialBalance;
		}

	void deposit(double d){
	initialBalance+=d;
	}
	
	void withdraw(int w){
		if(initialBalance >= w)
			initialBalance-=w;
		else
			System.out.println("insufficient funds");
		}
}
	
class AccountMain{
	public static void main(String[] args){
		Account acc = new Account(args[0],Integer.parseInt(args[1]),args[2],Integer.parseInt(args[3]));
		acc.getBalance();
		acc.deposit(6000.24);
		acc.withdraw(5000);
		
	}
}
	
	