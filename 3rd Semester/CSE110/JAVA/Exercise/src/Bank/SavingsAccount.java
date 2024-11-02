package Bank;

public class SavingsAccount extends BankAccount {
    private double withdrawalLimit;
    SavingsAccount(double initialbalance,double withdrawalLimit){
        super(initialbalance);
        this.withdrawalLimit = withdrawalLimit;
    }
    

    
    
    
}
