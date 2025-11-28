package inheritance;

public class BankAccountDriver {
	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount("Sanikaa","BOI2710","Bank Of india",324325435345l,1234,"Pune",9763704003l,7000.0,3,"Saving Account");
		s1.displaySavingAccount();
		System.out.println("------------");
		s1.displayBankAccount();
		
	}

}
