package inheritance;

public class SavingAccount extends BankAccount {
	double balance;
	double interest;
	String type;

	public SavingAccount()
	{}
	
	public SavingAccount(String name,String ifsc,String bankName,long accno,int pin,String branch,long phno,double balance,double interest,String type)
	{

		this.name=name;
		this.ifsc=ifsc;
		this.bankName=bankName;
		this.accno=accno;
		this.pin=pin;
		this.branch=branch;
		this.phno=phno;
		this.balance=balance;
		this.interest=interest;
		this.type=type;
	}
	public void displaySavingAccount()
	{
		displayBankAccount();
		System.out.println(balance);
		System.out.println(interest);
		System.out.println(type);
	}
}
