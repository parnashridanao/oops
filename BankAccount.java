import java.util.Scanner;
 class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    BankAccount(String acc, String accNo, double bal) {
        accountHolder = acc;
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            displayBalance();
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + " | Holder: " + accountHolder + " | Balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number:");
        String accountNumber = sc.nextLine();

        System.out.println("Enter account holder name:");
        String accountHolder = sc.nextLine();

        System.out.println("Enter your balance:");
        double balance = sc.nextDouble();

        BankAccount acc = new BankAccount(accountHolder, accountNumber, balance);

        acc.displayBalance();
        acc.deposit(5000);

        acc.withdraw(2000);
    
    }
}
  