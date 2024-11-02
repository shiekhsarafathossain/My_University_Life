package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean res = true;

        while (res) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            int loop = input.nextInt();
            ArrayList<Account> list = new ArrayList<Account>();
            switch (loop) {
                case (1): {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Enter Account Id: ");
                        int id = input.nextInt();
                        System.out.println("Enter Account Initial Balance: ");
                        double ba = input.nextDouble();
                        System.out.println("Enter Annual Interest Rate: ");
                        double ar = input.nextDouble();
                        System.out.println("Enter Overdraft Limit: ");
                        double ov = input.nextDouble();
                        list.add(new CheckingAccount(id, ba, ar, ov));
                        list.get(i).display();
                        System.out.println();
                    }
                    break;
                }

                case (2): {
                    for (int i = 0; i < 1; i++) {
                        System.out.println("Enter Account Id: ");
                        int id = input.nextInt();
                        System.out.println("Enter Account Initial Balance: ");
                        double ba = input.nextDouble();
                        System.out.println("Eneter Annual Interest Rate: ");
                        double ar = input.nextDouble();
                        input.nextLine();
                        System.out.println("Enter Creditcard Number: ");
                        String ov = input.nextLine();
                        list.add(new SavingsAccount(id, ba, ar, ov));
                        list.get(i).display();
                    }
                    break;
                }

                case (0):
                    System.out.println("Press 0 to Exit: ");
                    res = false;

                default:
                    System.out.println("Invaid Input");
                    break;
            }
        }
    }
}
