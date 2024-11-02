
package lab7;

public class CheckingAccount extends Account {
    private double overdraftlimit;
    
    CheckingAccount(){
        super();
    }
    CheckingAccount(int id, double balance, double annualInterestRate, double overdraftlimit){
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
    double withdraw(double amount){
        if((super.getBalance() >= amount) && (amount > overdraftlimit)){
        double bl = super.getBalance()-amount;
        setBalance(bl);
        return getBalance();
        }
        else{
            System.out.println("No balance!");
            setBalance(super.getBalance()-amount);
            return getBalance();
        }
    }
    @Override
    double deposit(double amount){
        setBalance(super.getBalance()+amount);
        return getBalance();
    }
    public void display(){
       /* System.out.println("This is a Checking Account");
        System.out.println("Account ID: "+super.getId());
        System.out.println("Date Created: "+super.getDateCreated());
        System.out.println("Current Balance: "+super.getBalance());
        System.out.println("Annual Interest Rate: "+super.getAnnualInterestRate());
        System.out.println("Monthly Interest Amount: "+super.getMonthlyInterestAmount());*/
        super.display();
        System.out.println("Overdraft Limit: "+getOverdraftlimit());
    }
    
    
    
}
