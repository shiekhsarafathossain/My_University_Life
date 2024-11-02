package coding1;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the center and radius of the circle
        System.out.print("Enter the center (p,q) of the circle: ");
        double centerX = input.nextDouble();
        double centerY = input.nextDouble();
        System.out.print("Enter the radius (r) of the circle: ");
        double radius = input.nextDouble();
        
        // Prompt the user to enter a point
        System.out.print("Enter a point (x,y): ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        
        // Calculate the distance between the center and the point using the distance formula
        double distance = Math.sqrt(Math.pow((pointX - centerX), 2) + Math.pow((pointY - centerY), 2));
        
        // Check if the distance is less than or equal to the radius
        if (distance <= radius) {
            System.out.println("(" + pointX + "," + pointY + ") is inside the circle centered at (" + centerX + "," + centerY + ") with radius " + radius + ".");
        } else {
            System.out.println("(" + pointX + "," + pointY + ") is outside the circle centered at (" + centerX + "," + centerY + ") with radius " + radius + ".");
        }
        
        input.close();
    }
}
