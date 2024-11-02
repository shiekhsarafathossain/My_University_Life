package javaapplication15;

import java.util.Scanner;

public class Homework6 {
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
        
        array = new int[r][c];

        System.out.println("Enter Array Elements:\t");
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                array[row][col] = input.nextInt();
            }
        }
        
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
        
        System.out.printf("Largest element : %d\n",max);
        System.out.printf("smallest index of the largest element is array[%d][%d]\n",smallrow,smallcol);
        }
}