package w3school;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Color: ");
        String color = input.nextLine();
        System.out.println("Enter Speed: ");
        double maxspeed = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Company: ");
        String comp = input.nextLine();
        System.out.println("Enter Model: ");
        String model = input.nextLine();
        System.out.println("Enter year: ");
        int year = input.nextInt();
        System.out.println("Is Engine on? ");
        int eng = input.nextInt();
        Maruti op = new Maruti(color, maxspeed, comp, model, year, eng);
        op.display();
    }

}
