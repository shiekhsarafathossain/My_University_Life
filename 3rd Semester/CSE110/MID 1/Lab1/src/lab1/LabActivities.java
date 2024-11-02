package lab1;

import java.util.Scanner;

public class LabActivities {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name = input.nextLine();                        //error next line
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your CGPA: ");
        double cgpa = input.nextDouble();
        input.nextLine();                          //To fix the department input
        System.out.println("Enter your department: ");
        String department = input.nextLine(); //nextLine
        System.out.printf("Your Name: %s\n",name);
        System.out.printf("Your Age: %d\n",age);
        System.out.printf("Your CGPA: %.2f\n",cgpa);
        System.out.printf("Your Department: %s\n",department);
    }
    
}
