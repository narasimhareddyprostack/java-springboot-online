class InsufficientFundsEx extends Exception{

	public String toSting() {
		System.out.println("Test Case");
		return "Insuffient Funds! Pleas Deposit Money";
	}
	
}
public class Bank {
	double balance = 50000;
	public void withDraw(double amount) throws InsufficientFundsEx {
		if(balance > amount) {
			System.out.print("Withdraw Money");
		}
		else {
			throw new InsufficientFundsEx();
		}
	}
	
	public static void main(String[] args){
		   
		    try {
		    	Bank c1 =new Bank();
				c1.withDraw(60000);
		    }
		    catch(InsufficientFundsEx e) {
		    	System.out.print(e.toSting());
		    	
		    }
	}

}
