package arrayhw;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int r,c,sum=0;
        
        
        System.out.print("Enter Array Row and Column: ");
        r = input.nextInt();
        c = input.nextInt();
        System.out.print("\n");
        array = new int[r][c];

        System.out.println("Enter Array Elements:");
        for(int row=0; row <r ; row++){
            for(int col=0; col<c;col++){
                array[row][col] = input.nextInt();
                sum += array[row][col];
            }
        }
        System.out.print("\n");
        System.out.println("2D Array With Index Number:");
        for(int row=0; row <r ; row++){
            for(int col=0; col<c;col++){
                System.out.printf("Array[%d][%d] = %d \t",row,col,array[row][col]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.printf("Sum = %d\n",sum);
    }
}