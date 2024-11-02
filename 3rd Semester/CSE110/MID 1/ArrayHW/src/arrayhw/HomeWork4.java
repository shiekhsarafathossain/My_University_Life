package arrayhw;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int row,col;
        int r,c,sum;
        
        
        System.out.print("Enter Array Row and Column: ");
        r = input.nextInt();
        c = input.nextInt();
        System.out.print("\n");
        array = new int[r][c];

        System.out.println("Enter Array Elements:");
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                array[row][col] = input.nextInt();
            }
        }
        
        System.out.print("\n");
        System.out.println("2D Array With Index Number:");
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                System.out.printf("Array[%d][%d] = %d \t",row,col,array[row][col]);
            }
             System.out.print("\n");
        }
        System.out.print("\n");
        for (row = 0; row < r; row++) {
            sum=0;
            for (col = 0; col < c; col++) {
                sum += array[col][row];
            }
        System.out.printf("Sum of elements by column (%d) is %d\n", row+1, sum);
        }
        
    }
    
}
