package coding1;
import java.util.Scanner;
public class Assignment11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fact, factorial = 1;
        System.out.print("Enter any number: ");
        fact = input.nextInt();
        
        for (int i = 1; i <= fact; i++) {
            
            factorial = factorial* i;
        }
        System.out.println("Factorial is "+factorial);
        
    }
}
