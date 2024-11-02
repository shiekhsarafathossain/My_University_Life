package arrayhw;

import java.util.Scanner;

public class HomeWork7 {
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

        System.out.println("Enter Array Elements:");
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                array[row][col] = input.nextInt();
            }
        }
        
        
        for(row=0; row <r ; row++){
            for(col=0; col<c;col++){
                int index = (int) (Math.random() * array.length);
                int index1 = (int) (Math.random() * array[row].length);
                int temp = array[row][col];
                array[row][col] = array[index][index1];
                array[index][index1] = temp;
            }
        }
        System.out.print("\n");
        System.out.println("Random Shuffling: ");
        for(row = 0; row < r; row++){
            for(col = 0; col < c; col++){
                System.out.printf("Array [%d][%d] = %d\t",row,col,array[row][col]);
                
            }
            System.out.print("\n");
        }
    }
    
}
