package inheritancepackage;

import java.util.Scanner;

class Employeer{
    float salary;
    
}

class Programmer extends Employeer{
    int bonus;
    
}

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Programmer p1 = new Programmer();
        
        System.out.println("Enter Salary: ");
        p1.salary = input.nextFloat();
        
        System.out.println("Enter Bonus: ");
        p1.bonus = input.nextInt();
        
        System.out.println("Programmer Salary = "+p1.salary);
        System.out.println("Programmer Bonus = "+p1.bonus);
    }
}
