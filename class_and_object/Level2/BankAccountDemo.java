
    class BankAccount {
        String accountHolder;
        String accountNumber;
        double balance;
    
        public BankAccount(String accountHolder, String accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }
    
        public void displayBalance() {
            System.out.println("Current Balance: $" + balance);
        }
    }
    
    // Main class to test the BankAccount
    public class BankAccountDemo {
        public static void main(String[] args) {
            BankAccount account = new BankAccount("John Doe", "123456789", 1000);
            account.displayBalance();
            account.deposit(500);
            account.displayBalance();
            account.withdraw(300);
            account.displayBalance();
            account.withdraw(1500);
        }
    }