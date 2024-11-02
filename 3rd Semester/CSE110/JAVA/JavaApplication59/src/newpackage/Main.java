package newpackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean res = true;
        
        do{
            try{
                System.out.println("Enter an integer: ");
                int number = input.nextInt();
                
                System.out.println("The number entered is "+number);
                res = false;
            }catch(InputMismatchException e){
                System.out.println("Try again. (" + "incorrect input: an integer is required");
                input.nextLine();
            }
        }while(res);
        
        
        
        
    }
}
