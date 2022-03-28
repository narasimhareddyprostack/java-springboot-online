package polyex;

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings_Account a1 = new Savings_Account();
		a1.setAcc_Id(101);
		a1.setAcc_Name("Rahul Gandhi");
		a1.setAcc_Balance(10000);
		a1.setMin_Bal(500);
		System.out.println(a1.getAcc_Id() + ":"+ a1.getAcc_Name()+":"+a1.getAcc_Balance());
		
		System.out.println("________________");
		Current_Account a2 = new Current_Account();
		a2.setAcc_Id(901);
		a2.setAcc_Name("Priyanka Gandhi");
		a2.setAcc_Balance(25000);
		
		a2.setMin_Bal(600);
		
		System.out.println(a2.getAcc_Id() + ":"+ a2.getAcc_Name()+":"+a2.getAcc_Balance());
		
//		a1.cal_Bal();
//		a2.cal_Bal();
		
		//AccountService.showDetails(a1);
		AccountService.showDetails(a2);
	}

}
