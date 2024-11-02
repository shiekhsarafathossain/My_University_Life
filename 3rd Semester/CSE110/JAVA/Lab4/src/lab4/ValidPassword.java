package lab4;

import java.util.Scanner;

public class ValidPassword {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String pass = input.nextLine();

        if (validPassword(pass)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean validPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        int digitcount = 0;

        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            if (Character.isDigit(ch)) {
                digitcount++;
            }
        }
        return digitcount >= 2;

    }
}
