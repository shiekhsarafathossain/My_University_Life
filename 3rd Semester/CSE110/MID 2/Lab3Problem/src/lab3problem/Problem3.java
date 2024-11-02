package lab3problem;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,mod,temp,sum = 0; 
        
        System.out.print("Enter Number: ");
        num = input.nextInt();
        
        temp = num;    
        while(num>0){    
         mod = num%10;  
         sum = (sum*10)+mod;    
         num = num/10;    
        }
        
        if(temp==sum){
            System.out.printf("%d is a palindrome number\n",temp); 
        }  
            
        else{
            System.out.printf("%d is not a palindrome number\n",temp); 
        }   
    }
}
