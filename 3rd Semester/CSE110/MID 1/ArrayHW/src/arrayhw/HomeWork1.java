package arrayhw;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        int[][] array;
        int r,c;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Array Row and Column: ");
        r = input.nextInt();
        c = input.nextInt();
        
        array = new int [r][c];
        
        System.out.println("Enter Array Elements:");
        for (int row = 0; row <r; row++) {
            for(int col = 0; col <c ; col++){
            array[row][col] = input.nextInt();
            }
        }
    }
    
}
