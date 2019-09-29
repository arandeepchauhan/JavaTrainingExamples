package constructor;


public class TestAccountContructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Account account=new Account();
		AccountConstructor account1 = new AccountConstructor(101,"Madhu", 15000);
		AccountConstructor account2 = new AccountConstructor(102,"ABC", 12000);


		System.out.println(account1.showDetails());

		boolean b1 = account1.withdraw(1000);
		if (true) {
			System.out.println("amount debited successfully.");

			 System.out.println("total available balance is : "+
			account1.getBalance());

		} else {
			System.out.println("No sufficieant fund");
		}

		boolean b2 = account1.deposite(2000);
		if (true)
			System.out.println("amount credited successfully");
		 System.out.println("amount Credited. Total Balance : " +
		account1.getBalance());

	}

}
