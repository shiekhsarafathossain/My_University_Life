package coding1;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        char ch, ch1;
        Scanner input = new Scanner(System.in);
        
        System.out.print("have you completed your masters? Type y/Y/n/N: ");
        ch = input.next().charAt(0);
        
        System.out.print("are you fulent in English? Type y/Y/n/N: ");
        ch1 = input.next().charAt(0);
        
        
        if(ch == 'y' && ch1 == 'y'){
            System.out.println("you are eligible for the job interview");
        }
        else{
            System.out.println("Sorry. You are not eligible for the job interview");
        }
   
        
        
    }
    
}
