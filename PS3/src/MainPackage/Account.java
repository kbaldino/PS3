package MainPackage;

import java.util.Date;

public class Account {

	// private fields
	private int ID = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	
	
	// no arg constructor
	public Account(){
	}
	
	
	// constructor method 
	public Account(int ID, double balance, double annualInterestRate){		
	}
	
	
	// accessor methods
	public int getID(){
		return ID;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}

	public Date getDateCreated(){
		return dateCreated;
	}
	
		
	// mutator methods
	public void setID(int ID){
		this.ID = ID;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

	
	// monthly interest rate method
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	
	// withdraw method
	public double withdraw(double x){
		return balance -= x;
	}
	
	
	// deposit method
	public double deposit(double x){
		return balance+= x;
	}
	
}
