package coding1;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        int initial = input.nextInt();
        int last = input.nextInt();
        
        Loops(initial,last);
    }
    
    public static void Loops(int n,int m){
        for (int i = n; i <= m; i++) {
            System.out.println(i +"");
        }
    }
    
    public static int Sum(int number){
        int sum=0;
        
        for(int i=1;i<10;i++){
            sum+=number;
        }
        
        return sum;
    }
    
    
}
