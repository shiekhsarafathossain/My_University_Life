package lab7manual;

public class Test {
    public static void main(String[] args) {
        
        Account a1 = new Account(1122,20000,4.5);
        
        a1.withdraw(2500);
        a1.deposit(3000);
        
        System.out.println(a1.display());
        
    }
}
