package chatgpt;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        System.out.println("Press (1) for creating a Checking Account");
        System.out.println("Press (2) for creating a Savings Account");

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter Account ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter initial Balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double annualInterestRate = scanner.nextDouble();
                System.out.print("Enter Overdraft Limit: ");
                double overdraftLimit = scanner.nextDouble();

                CheckingAccount checkingAccount = new CheckingAccount(id, balance, annualInterestRate, overdraftLimit);
                accounts.add(checkingAccount);
            } else if (choice == 2) {
                System.out.print("Enter Account ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter initial Balance: ");
                double balance = scanner.nextDouble();
                System.out.print("Enter Annual Interest Rate: ");
                double annualInterestRate = scanner.nextDouble();
                scanner.nextLine(); // Clear the newline character
                System.out.print("Enter Credit Card Number: ");
                String creditCardNumber = scanner.nextLine();
                System.out.print("Enter Card Expiry Date (MM/DD/YYYY): ");
                String expiryDateStr = scanner.nextLine();
                String[] dateParts = expiryDateStr.split("/");
                int month = Integer.parseInt(dateParts[0]);
                int day = Integer.parseInt(dateParts[1]);
                int year = Integer.parseInt(dateParts[2]);
                Calendar cardExpiryDate = Calendar.getInstance();
                cardExpiryDate.set(year, month - 1, day);

                SavingsAccount savingsAccount = new SavingsAccount(id, balance, annualInterestRate, creditCardNumber, cardExpiryDate);
                accounts.add(savingsAccount);
            }
        }

        for (Account account : accounts) {
            if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                System.out.println("This is a Checking Account");
                System.out.println("Account ID: " + checkingAccount.getId());
                System.out.println("Date Created: " + checkingAccount.getDateCreated().getTime());
                System.out.println("Current Balance: $" + checkingAccount.getBalance());
                System.out.println("Annual Interest Rate: " + checkingAccount.getAnnualInterestRate() + "%");
                System.out.println("Monthly Interest Amount: $" + checkingAccount.getMonthlyInterestAmount());
                System.out.println("Overdraft Limit: $" + checkingAccount.getOverdraftLimit());
            } else if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                System.out.println("This is a Savings Account");
                System.out.println("Account ID: " + savingsAccount.getId());
                System.out.println("Date Created: " + savingsAccount.getDateCreated().getTime());
                System.out.println("Current Balance: $" + savingsAccount.getBalance());
                System.out.println("Annual Interest Rate: " + savingsAccount.getAnnualInterestRate() + "%");
                System.out.println("Monthly Interest Amount: $" + savingsAccount.getMonthlyInterestAmount());
                System.out.println("Credit Card Number: " + savingsAccount.getCreditCardNumber());
                System.out.println("Card Expiry Date: " + savingsAccount.getCardExpiryDate().getTime());
                System.out.println("Credit Balance: $" + savingsAccount.getCreditBalance());
            }
            System.out.println();
        }
    }
}

