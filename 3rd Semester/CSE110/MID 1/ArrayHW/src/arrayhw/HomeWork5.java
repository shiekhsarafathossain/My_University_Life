package arrayhw;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int row,col;
        int r,c;
        
        
        System.out.print("Enter Array Row and Column: ");
        r = input.nextInt();
        c = input.nextInt();
        System.out.print("\n");
        array = new int[r][c];
        int[] sum = new int[r];
        
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
            sum[row]=0;
            for (col = 0; col < c; col++) {
                sum[row] += array[row][col];
            }
        System.out.printf("Sum of elements by Row (%d) is %d\n", row+1, sum[row]);
        
        }
        int max = 0;
        int count = 0;
        for (row = 0; row < r; row++) {
                if (sum[row] > max) {
                    max=sum[row];
                    count++;
                }
            }
        System.out.print("\n");
        System.out.printf("The largest sum is in row (%d)\n",count);
        
    }

}
