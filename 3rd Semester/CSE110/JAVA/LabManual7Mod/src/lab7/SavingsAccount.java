package lab7;

import java.util.Calendar;

public class SavingsAccount extends Account {
    private String creditCardNumber;
    private java.util.Date dateCreated = new java.util.Date();
    private Calendar expieryDate;
   // Account acc = new Account();
    
    SavingsAccount(){
        super.getDateCreated();
        expieryDate = Calendar.getInstance();
        expieryDate.add(Calendar.YEAR,1);
    }
    
    SavingsAccount(int id, double balance, double annualInterestRate, String creditCardNumber){
        super(id,balance,annualInterestRate);
        this.creditCardNumber = creditCardNumber;
        expieryDate = Calendar.getInstance();
        expieryDate.add(Calendar.YEAR,1);
        
    }
    
    public String getcreditCardNumber(){
        return creditCardNumber;
    }
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    public Calendar getExpiryDate(){
        return expieryDate;
    }
    
    double getCreditBalance(){
        return super.getBalance()*3;
    }
    
    public void display(){
       /* System.out.println("This is a Savings Account");
        System.out.println("Account ID: "+super.getId());
        System.out.println("Date Created: "+super.getDateCreated());
        System.out.println("Current Balance: "+super.getBalance());
        System.out.println("Annual Interest Rate: "+super.getAnnualInterestRate());
        System.out.println("Monthly Interest Amount: "+super.getMonthlyInterestAmount());*/
        super.display();
        System.out.println("Credit Card Number: "+getcreditCardNumber());
        System.out.println("Card Expiry Date: "+getExpiryDate());
        System.out.println("Credit Balance: "+getCreditBalance());
    }

    
}
