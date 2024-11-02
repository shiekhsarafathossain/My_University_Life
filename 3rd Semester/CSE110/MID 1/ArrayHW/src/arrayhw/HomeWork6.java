package arrayhw;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int row,col;
        int r,c,max;
        int smallrow = 0;
        int smallcol = 0;
        
        
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
        
        max = array[0][0];
        
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                if(max<array[row][col]){
                    max = array[row][col];
                    smallrow = row;
                    smallcol = col;
                }
            }
        }
        System.out.print("\n");
        System.out.printf("Largest element : %d\n",max);
        System.out.printf("Smallest index of the largest element is Array[%d][%d]\n",smallrow,smallcol);
    }
    
}
