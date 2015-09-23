package MainPackage;

public class TestAccount {
	public static void main(String[] args) {

		Account testAccount = new Account();
		testAccount.setID(1122);
		testAccount.setBalance(20000);
		testAccount.setAnnualInterestRate(.045);

		double testBalance = testAccount.withdraw(2500);
		double testBalance2 = testAccount.deposit(3000);
		double monthlyInterestRate = testAccount.getMonthlyInterestRate();

		System.out.println("Current Account Balance: $" + testBalance);
		System.out.println("Current Account Balance: $" + testBalance2);
		System.out.println("The Monthly Interest Rate is: " + monthlyInterestRate);
		System.out.println("This Account was created on: " + testAccount.getDateCreated());
	}
}
