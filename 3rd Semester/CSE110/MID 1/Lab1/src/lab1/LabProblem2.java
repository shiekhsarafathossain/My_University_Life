package lab1;

import java.util.Scanner;

public class LabProblem2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);    
        
        System.out.print("Enter Minute: ");
        int min = i.nextInt();
        
        int hr = min/60;
        int day = hr/24;
        int year = day/365;
        int days = day%365;
        
        System.out.printf("%d year %d days \n",year,days);
     
        
    }
    
}
