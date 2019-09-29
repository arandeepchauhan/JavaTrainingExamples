package constructor;

public class AccountConstructor {
	private int accNo;
	private String accHolderName;
	private double balance;
	
	
	public String getAccHolderName() {
		return accHolderName;
	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	AccountConstructor(int accNo,String accHolderName,double balance)
	{
		this.accNo=accNo;
		this.accHolderName=accHolderName;
		this.balance=balance;
		System.out.println("Accunt No: "+accNo + "  AccHoldername :" + accHolderName + " TotalBalance :" +balance );
	}
	
	public String showDetails() {
		return "ID: " + accNo +
				"\nName: " + accHolderName + 
				"\nBalance: " + balance;
		
	}

	
public boolean withdraw(double amount)
{
	if(balance-amount<500)
	return false;
	else
	
		balance=balance-amount;
	return true;
}
public boolean deposite(double amount)
{
	balance=balance+amount;
	return true;
}
	

}
