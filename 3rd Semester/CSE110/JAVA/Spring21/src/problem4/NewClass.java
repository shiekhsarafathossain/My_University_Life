package problem4;

class Account implements Comparable <Account> {
    String accname;
    double withdraw;
    double deposite;

    public Account(String accname, double withdraw, int deposite) {
        this.accname = accname;
        this.withdraw = withdraw;
        this.deposite = deposite;
    }
    
    @Override
    public int compareTo(Account other){
        return Double.compare(this.deposite, other.deposite);
    }
   
    public String toString(){
        String str = "Account Name: "+accname+" "+withdraw+" "+deposite;
        return str;
    }
    
}


public class NewClass {
    public static void main(String[] args) {
     /*    accounts[0] = new Account("John", 1000.0, 500.0);
        accounts[1] = new Account("Alice", 1500.0, 200.0);
        accounts[2] = new Account("Bob", 800.0, 300.0);
        accounts[3] = new Account("Eve", 1200.0, 100.0);
        accounts[4] = new Account("Charlie", 900.0, 400.0);

        // Sort accounts by deposited amount
        Arrays.sort(accounts);

        System.out.println("Sorted by Deposit Amount:");
        for (Account account : Account) {
            System.out.println(account);
        }

        // Modify compareTo to order by account name
        Arrays.sort(Account, (a1.getAccname().compareTo(a2.getAccname())) ;

        System.out.println("\nSorted by Account Name:");
        for (Account account : accounts) {
            System.out.println(account);
        }*/
    }
}
