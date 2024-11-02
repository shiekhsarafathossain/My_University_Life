package chatgpt;
import java.util.Calendar;
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
