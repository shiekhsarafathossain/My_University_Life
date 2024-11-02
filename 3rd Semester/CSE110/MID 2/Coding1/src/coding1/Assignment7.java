package coding1;
import java.util.Scanner;
public class Assignment7 {
    public static void main(String[] args){
        
        char ch;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you love java? ");
        
        System.out.print("Type y/Y or n/N :");
        ch = input.next().charAt(0);
        
        if(ch == 'y' || ch == 'Y'){
            System.out.println("you are a java lover");
        }
        else if(ch == 'n' || ch == 'N'){
            System.out.println("you are not a java lover");
        }
        else{
            System.out.println("Invalid Input");
        }
        System.out.println(Math.random()*10);
        
    } 
    
}
