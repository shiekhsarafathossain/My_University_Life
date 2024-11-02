package coding1;

import java.util.Scanner;

public class Coding1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double base, height, area;
        
        System.out.print("Enter Base: ");
        base = input.nextFloat();
        
        System.out.print("Enter Height: ");
        height = input.nextFloat();
        
        area = 0.5 * base * height;
        
        System.out.printf("Area of triangle = %f ",area);
        
        
        
      
    }
    
}
