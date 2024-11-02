package lab7manual;

public class CheckingAccount extends Account {

    private double overdraftlimit;

    CheckingAccount() {
        super();
    }

    CheckingAccount(int id, double balance, double annualInterestRate, double overdraftlimit) {
        super(id, balance, annualInterestRate);
        this.overdraftlimit = overdraftlimit;
    }

    public double getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(double overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() > amount && getOverdraftlimit() >= amount) {
            super.setBalance(super.getBalance() - amount);
            System.out.println(amount + " Successfully withdraw from account: " + super.getId() + "\nCurrent Balance: $" + super.getBalance());
        } else {
            System.out.println("Insufficient balance! ");
        }
    }

    @Override
    public String display() {
        String str = "Checking Account: \n"
                + "\nAccount ID: " + super.getId()
                + "\nDate Created: " + super.getDateCreated().getTime()
                + "\nCurrent Balance: $" + super.getBalance()
                + "\nAnnual Interest Rate: " + super.getAnnualInterestRate() + "%"
                + "\nMonthly Interest Amount: $" + super.getMonthlyInterestAmount()
                + "\nOverdraft Limit: $" + getOverdraftlimit();
        return str;
    }

}
