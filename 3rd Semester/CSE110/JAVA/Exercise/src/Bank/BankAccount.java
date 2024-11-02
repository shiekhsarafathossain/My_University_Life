package Bank;

public class BankAccount {

    private double balance;

    BankAccount(double initialbalance) {
        this.balance = initialbalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount) {
        if (balance <= amount) {
            setBalance(balance - amount);
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
}
