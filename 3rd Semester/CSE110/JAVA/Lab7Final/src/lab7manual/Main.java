package lab7manual;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Account> acclist = new ArrayList<Account>();
        boolean res = true;
        int i = 0;
        while (res) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            System.out.println("Press (0) to Exit");
            int sw = input.nextInt();

            switch (sw) {
                case (1): {
                    System.out.println("Creating a Checking Account");
                    System.out.println("Enter Account Id: ");
                    int id = input.nextInt();
                    System.out.println("Enter Account Initial Balance: ");
                    double ba = input.nextDouble();
                    System.out.println("Enter Annual Interest Rate: ");
                    double ar = input.nextDouble();
                    System.out.println("Enter Overdraft Limit: ");
                    double ov = input.nextDouble();
                    acclist.add(new CheckingAccount(id, ba, ar, ov));
                    System.out.println(acclist.get(i).display());
                    i++;
                    System.out.println();
                    break;
                }

                case (2): {

                    System.out.println("Creating a Savings Account");
                    System.out.println("Enter Account Id: ");
                    int id = input.nextInt();
                    System.out.println("Enter Account Initial Balance: ");
                    double ba = input.nextDouble();
                    System.out.println("Eneter Annual Interest Rate: ");
                    double ar = input.nextDouble();
                    input.nextLine();
                    System.out.println("Enter Creditcard Number: ");
                    String cn = input.nextLine();
                    acclist.add(new SavingsAccount(id, ba, ar, cn));
                    System.out.println(acclist.get(i).display());
                    i++;
                    System.out.println();
                    break;
                }
                case (0): {
                    res = false;
                    break;
                }
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
