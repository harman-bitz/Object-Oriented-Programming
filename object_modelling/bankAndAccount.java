import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

   
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBalance(initialBalance);  
        this.customers.add(customer);         
        System.out.println("Account opened for " + customer.getName() + " at " + this.name + " with initial balance " + initialBalance);
    }

    
    public double getTotalBankBalance() {
        double totalBalance = 0;
        for (Customer customer : customers) {
            totalBalance += customer.getBalance();
        }
        return totalBalance;
    }
}

class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0;  
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void viewBalance() {
        System.out.println("Customer: " + this.name + ", Balance: " + this.balance);
    }

   
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + ". New Balance: " + this.balance);
    }

   
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds for withdrawal of " + amount + ". Current Balance: " + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrew " + amount + ". New Balance: " + this.balance);
        }
    }
}

public class bankAndAccount {

	public static void main(String[] args) {
		Bank chaseBank = new Bank("Chase Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        
        chaseBank.openAccount(alice, 1000); 
        chaseBank.openAccount(bob, 500);   

        
        System.out.println("Alice's account balance:");
        alice.viewBalance();
        System.out.println("Bob's account balance:");
        bob.viewBalance();

       
        alice.deposit(500);  
        alice.withdraw(200); 

       
        System.out.println("Updated Alice's account balance:");
        alice.viewBalance();
	}

}