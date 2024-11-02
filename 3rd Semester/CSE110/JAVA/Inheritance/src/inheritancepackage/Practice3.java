package inheritancepackage;

import java.util.Scanner;

class Employee {

    float salary;

}

class Programmer extends Employee {

    int bonus;

}

class JavaProgrammer extends Employee {

    int salary;

    int javapsalary() {
        return (this.salary + salary);
    }
}

public class Practice3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Programmer p1 = new Programmer();
        System.out.println("Enter Salary: ");
        p1.salary = input.nextFloat();

        System.out.println("Enter Bonus: ");
        p1.bonus = input.nextInt();
        System.out.println("Programmer Salary = " + p1.salary);
        System.out.println("Programmer Bonus = " + p1.bonus);

        JavaProgrammer Jp = new JavaProgrammer();
        System.out.println("Java Programmer Salary is Basic Salary Multiply Java Programmer Salary");
        System.out.println("Enter Java Programmer Salary: ");
        Jp.salary = input.nextInt();
        System.out.println("Java Programmer Salary Main = " + Jp.salary);
        System.out.print("Java Programmer Salary Total = ");
        System.out.println(Jp.javapsalary());
    }
}
