package lab1;

import java.util.Scanner;

public class LabProblem4 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        
        int input;
        double usd,taka;
        
        double usdttaka = 108.99;
        double takatusd = 0.0092;
        
        System.out.println("0) USD to BDT: ");
        System.out.println("1) BDT to USD: ");
        System.out.print("Enter 0 or 1: ");
        input = i.nextInt();
        
        if(input==0){
            System.out.print("Enter USD Amount: ");
            usd = i.nextDouble();
            System.out.printf("%.2f USD is %.2f TAKA\n",usd,(usdttaka*usd));
        }
        
        else if(input==1){
            System.out.print("Enter BDT Amount: ");
            taka = i.nextDouble();
            System.out.printf("%.2f Taka is %.2f USD\n",taka,(takatusd*taka));
        }
        
        else{
            System.out.println("Invalid Input");
        }
        
        
    }
}
