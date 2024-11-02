package lab7manual;

import java.util.Calendar;

public class SavingsAccount extends Account {

    private String creditCardNumber;
    private Calendar dateCreated;
    private Calendar expieryDate;

    SavingsAccount() {
        super.getDateCreated();
        expieryDate = Calendar.getInstance();
        expieryDate.add(Calendar.YEAR, 2);
    }

    SavingsAccount(int id, double balance, double annualInterestRate, String creditCardNumber) {
        super(id, balance, annualInterestRate);
        this.creditCardNumber = creditCardNumber;
        expieryDate = Calendar.getInstance();
        expieryDate.add(Calendar.YEAR, 2);

    }

    public String getcreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public Calendar getExpiryDate() {
        return expieryDate;
    }

    double getCreditBalance() {
        return (super.getBalance() * 3);
    }

    @Override
    public void withdraw(double amount) {
        if (getCreditBalance() >= amount && super.getBalance() >= amount) {
            super.setBalance(super.getBalance() - amount);
            System.out.println(amount + " Successfully deposited to account: " + super.getId() + "\nCurrent Balance: " + super.getBalance());
        } else {
            System.out.println("Insufficient balance! ");
        }
    }

    @Override
    public String display() {
        String str = "Savings Account: \n"
                + "\nAccount ID: " + super.getId()
                + "\nDate Created: " + super.getDateCreated().getTime()
                + "\nCurrent Balance: $" + super.getBalance()
                + "\nAnnual Interest Rate: " + super.getAnnualInterestRate() + "%"
                + "\nMonthly Interest Amount: $" + super.getMonthlyInterestAmount()
                + "\nCredit Card Number: " + getcreditCardNumber()
                + "\nCard Expiry Date: " + getExpiryDate().getTime()
                + "\nCredit Balance: $" + getCreditBalance();

        return str;
    }
}
