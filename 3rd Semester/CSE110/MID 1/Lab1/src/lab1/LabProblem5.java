package lab1;

import java.util.Scanner;

public class LabProblem5 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int x,y,r,p,q;
        
        System.out.print("Enter The Radius: ");
        r = i.nextInt();
        
        System.out.print("Enter the circle center (p,q): ");
        p = i.nextInt();
        q = i.nextInt();
        
        System.out.print("Enter the to if it's in the circle or not (x,y): ");
        x = i.nextInt();
        y = i.nextInt();
        
        double distance = Math.sqrt( ((x-p)*(x-p)) + ((y-q)*(y-q)) ); 
        
        if(distance <= r){
            System.out.println("The point is inside the circle");
        }
        
        else{
            System.out.println("The point is outside the circle");
        }
        
        
        
    }
    
}
