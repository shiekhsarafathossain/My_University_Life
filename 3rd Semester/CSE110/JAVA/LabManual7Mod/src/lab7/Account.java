package lab7;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private java.util.Date dateCreated = new java.util.Date();
    
    Account(){
        getDateCreated();
    }
    
    Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        //dateCreated = new java.util.Date();
        getDateCreated();
        
    }

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

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    
    double getMonthlyInterestAmount(){
        double monthly = (getAnnualInterestRate()/100)/12;
        return balance*monthly;
    }
    
    double withdraw(double amount){
        if(balance > 0){
        setBalance(balance-amount);
        return getBalance();
        }
        else{
            System.out.println("No balance!");
            setBalance(getBalance()-amount);
            return getBalance();
        }
    }
    
    double deposit(double amount){
        setBalance(getBalance()+amount);
        return getBalance();
    }
    
    void display(){
        System.out.println("Account ID: "+getId());
        System.out.println("Date Created: "+getDateCreated());
        System.out.println("Current Balance: "+getBalance());
        System.out.println("Annual Interest Rate: "+getAnnualInterestRate());
        System.out.println("Monthly Interest Amount: "+getMonthlyInterestAmount());
    }
    
}
