package polyex;

public class Savings_Account extends Account{
	private double min_Bal;

	public double getMin_Bal() {
		return min_Bal;
	}

	public void setMin_Bal(double min_Bal) {
		this.min_Bal = min_Bal;
	}
	
	public void cal_Bal() {
		double bal = getAcc_Balance();
		
		double min_Bal = getMin_Bal();
		bal = bal - min_Bal;
		System.out.print("Saving Account:"+ bal);
	}

}
