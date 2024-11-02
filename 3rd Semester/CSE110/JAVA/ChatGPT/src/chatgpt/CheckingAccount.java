package chatgpt;
import java.util.Calendar;
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraftLimit) {
        super(id, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

class SavingsAccount extends Account {
    private String creditCardNumber;
    private Calendar cardExpiryDate;

    public SavingsAccount(int id, double balance, double annualInterestRate, String creditCardNumber, Calendar cardExpiryDate) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = creditCardNumber;
        this.cardExpiryDate = cardExpiryDate;
    }

    public double getCreditBalance() {
        return getBalance() * 3;
    }
}

