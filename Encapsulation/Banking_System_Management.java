package week2_assignment4;

import java.util.*;


interface Loanable {
	boolean applyForLoan(double amount);
	double calculateLoanEligibility();
}


abstract class BankAccount implements Loanable {
	private String accountNumber;
	private String holderName;
	protected double balance;

public BankAccount(String accountNumber, String holderName, double balance) {
    this.accountNumber = accountNumber;
    this.holderName = holderName;
    this.balance = balance;
}

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Invalid deposit amount");
    }
}

public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    } else {
        System.out.println("Insufficient balance or invalid amount");
    }
}

public abstract double calculateInterest();

 	@Override
 	public boolean applyForLoan(double amount) {
     	return amount <= calculateLoanEligibility();
 	}

 	@Override
 	public double calculateLoanEligibility() {
 		return balance * 2; // Example: Loan eligibility is 2x the balance
 	}
 
 	public String getAccountDetails() {
 		return "Account Number: [Protected], Holder: " + holderName + ", Balance: " + balance;
 	}
}

//Savings Account subclass
class SavingsAccount extends BankAccount {
	private static final double INTEREST_RATE = 0.04; 

	public SavingsAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public double calculateInterest() {
		return balance * INTEREST_RATE;
	}
}


class CurrentAccount extends BankAccount {
	private static final double INTEREST_RATE = 0.02; 

	public CurrentAccount(String accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	@Override
	public double calculateInterest() {
		return balance * INTEREST_RATE;
	}
}


public class BankingSystem {
	public static void main(String[] args) {
		List<BankAccount> accounts = new ArrayList<>();
		accounts.add(new SavingsAccount("SAV123", "Alice", 5000));
		accounts.add(new CurrentAccount("CUR456", "Bob", 8000));

		for (BankAccount account : accounts) {
			System.out.println(account.getAccountDetails());
			System.out.println("Interest Earned: " + account.calculateInterest());
			System.out.println("Loan Eligibility: " + account.calculateLoanEligibility());
			System.out.println("Loan Approval for 10000: " + account.applyForLoan(10000));
			System.out.println("-----------------------------");
		}
	}
}

