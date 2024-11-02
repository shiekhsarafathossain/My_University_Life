package lab1;

import java.util.Scanner;

public class LabProblem1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num;
        
        System.out.print("Enter an integer number: ");
        num = i.nextInt();
        
        
        if(num%2==0 && num%3==0)
            System.out.println("False");
        else if(num%2==0 || num%3==0)
            System.out.println("True");
        else
            System.out.println("False");
    }
    
}