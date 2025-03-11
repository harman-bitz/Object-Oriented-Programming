class BankAccount {
    String accountNumber;
    double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
    double interestRate;
    
    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.interestRate = interestRate;
    }
    
    // Overriding displayAccountDetails() to include savings account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call the superclass method
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount (inherits from BankAccount)
class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    
    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.withdrawalLimit = withdrawalLimit;
    }
    
    // Overriding displayAccountDetails() to include checking account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call the superclass method
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount (inherits from BankAccount)
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    
    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance); // Calling the superclass constructor
        this.maturityPeriod = maturityPeriod;
    }
    
    // Overriding displayAccountDetails() to include fixed deposit account details
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call the superclass method
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
public class bankAccountTypes {

	public static void main(String[] args) {
		
		SavingsAccount savings = new SavingsAccount("SA12345", 5000.00, 2.5);
        savings.displayAccountDetails();
        
        System.out.println("----------------------");
        
        // Creating a CheckingAccount object
        CheckingAccount checking = new CheckingAccount("CA67890", 3000.00, 1000.00);
        checking.displayAccountDetails();
        
        System.out.println("----------------------");
        
        // Creating a FixedDepositAccount object
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD54321", 10000.00, 12);
        fixedDeposit.displayAccountDetails();
    }
}

