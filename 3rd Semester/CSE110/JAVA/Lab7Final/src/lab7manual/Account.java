package lab7manual;

import java.util.Calendar;

public class Account {
     private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Calendar dateCreated;
    
    Account(){
        this.dateCreated = Calendar.getInstance();
    }
    
    Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = Calendar.getInstance();
        
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

    public Calendar getDateCreated() {
        return dateCreated;
    }
    
    double getMonthlyInterestAmount(){
        double monthly = (getAnnualInterestRate()/100)/12;
        return balance*monthly;
    }
    
    public void withdraw(double amount){
        if(balance > 0){
        balance = balance-amount;
        System.out.println(amount + " Successfully withdraw from account: " + id +"\nCurrent Balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance! ");
        }
    }
    
    void deposit(double amount){
        balance = balance+amount;
        System.out.println(amount + " Successfully deposited to account: " + id +"\nCurrent Balance: "+balance);
    }
    
    public String display(){
        String str = "Account: "+
        "\nAccount ID: "+this.getId()+
        "\nDate Created: "+this.getDateCreated().getTime()+
        "\nCurrent Balance: $" +this.getBalance()+
        "\nAnnual Interest Rate: "+this.getAnnualInterestRate()+"%"+
        "\nMonthly Interest Amount: $"+this.getMonthlyInterestAmount();
        return str;
    }
}
