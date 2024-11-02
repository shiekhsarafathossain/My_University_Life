package coding1;
import java.util.Scanner;
public class ConditionalOperator {
    public static void main(String[] args){
        
        int x = 10;
        int y = 5;
        
        int large = (x!=y)?y:x;
        System.out.print("Large is "+large+"\n");
        
        
        Scanner input = new Scanner(System.in);
        int num1, num2, small;
        
        System.out.print("Enter Number 1: ");
        num1 = input.nextInt();
        System.out.print("Enter Number 2: ");
        num2 = input.nextInt();
        small = (num2>num1)?num1:num2;
        System.out.print(+small);
      
    }

}
