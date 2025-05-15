
public class BankingInformationSystem {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankingInformationSystem(String name, String accNumber, double initialBalance) {
        this.accountHolderName = name;
        this.accountNumber = accNumber;
        this.balance = initialBalance;
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

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankingInformationSystem account = new BankingInformationSystem("Idrish Shaik", "1234567890", 1000.0);
        account.displayAccountInfo();
        account.deposit(500);
        account.withdraw(200);
        account.displayAccountInfo();
    }
}
