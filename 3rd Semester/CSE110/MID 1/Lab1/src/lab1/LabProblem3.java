package lab1;

import java.util.Scanner;

public class LabProblem3 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        float a,b,c; //input
        float q,root;
        float r,r1,r2;
        
        
        System.out.print("Enter the value of a: ");
        a = i.nextFloat();
        System.out.print("Enter the value of b: ");                  
        b = i.nextFloat();
        System.out.print("Enter the value of c: ");
        c = i.nextFloat();
        
        
        q = (b*b) - (4*a*c);                                          
        root = (float) Math.sqrt(q);
        
        
        if(q==0){
            r = (-b) / (2*a);        
            System.out.printf("Root: %f \n",r);
        }
        
        else if(q>0){
            r1 = ( ( (-b) + root )/ (2*a) );
            r2 = ( ( (-b) - root )/ (2*a) );
            System.out.printf("First Root: %f \n",r1);
            System.out.printf("Second Root: %f \n",r2);
        }
        
        else{
            System.out.println("The Equation has no real roots");
        }
       
    }
    
}
