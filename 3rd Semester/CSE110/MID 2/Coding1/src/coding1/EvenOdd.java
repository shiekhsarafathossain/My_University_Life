package coding1;
import java.util.Scanner;
public class EvenOdd {
    
    public static void main(String[] args){
        
        int num;
        System.out.print("Enter a number : ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        if(num%2 == 0){
            System.out.printf("%d is a even number \n",num);
        }
        
        else{
            System.out.printf("%d is a odd number \n",num);
    } 
    
}
}