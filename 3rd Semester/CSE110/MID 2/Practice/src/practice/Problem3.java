package practice;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float a,b,c;
        float r,r1,r2;
        float root;
        System.out.print("Enter a,b,c: ");
        a = input.nextFloat();
        b = input.nextFloat();
        c = input.nextFloat();
        
        root =(b*b) - (4*a*c);
        float roots = (float) Math.sqrt(root);
        
        if(root == 0){
            r = (-b) / (2*a);
            System.out.printf("Root = %d\n",r);
        }
        
        else if(root > 0){
            r1 =( ( (-b) + roots ) / (2*a) );
            r2 =( ( (-b) - roots ) / (2*a) );
            System.out.printf("Root 1 = %f\n",+r1);
            System.out.printf("Root 2 = %f\n",r2);
        }
        else{
            System.out.println("The Equation has no real roots");
        }
    }
}
