package coding1;
import java.util.Scanner;
public class codeforce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int watermelon;
        watermelon = input.nextInt();
        
        if(watermelon>2 && watermelon%2==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
            
        
    }
    
}
