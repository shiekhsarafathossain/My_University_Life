
package account;

import java.util.Calendar;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Calendar dateCreated;

    public Account() {
        this(0, 0.0, 0.0);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
    }

    // Accessor and mutator methods for id, balance, and annualInterestRate

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accessor method for dateCreated

    public Calendar getDateCreated() {
        return dateCreated;
    }

    // Method to get the monthly interest rate

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Method to get the monthly interest amount

    public double getMonthlyInterestAmount() {
        return balance * getMonthlyInterestRate() / 100;
    }

    // Method to withdraw a specified amount from the account

    public void withdraw(double amount) {
        balance -= amount;
    }

    // Method to deposit a specified amount to the account

    public void deposit(double amount) {
        balance += amount;
    }
}

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


