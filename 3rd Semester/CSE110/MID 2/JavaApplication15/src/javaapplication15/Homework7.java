package javaapplication15;
import java.util.Scanner;

public class Homework7 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array;
        int i,j;
        int a,b;
        
        
        System.out.print("Enter the number Array Row and Column: ");
        a = input.nextInt();
        b = input.nextInt();
        
        array = new int[a][b];

        System.out.println("Enter Array Elements:\t");
        for(i=0; i <a ; i++){
            for(j=0; j<b;j++){
                array[i][j] = input.nextInt();
            }
        }
        
        
        for(i=0; i <a ; i++){
            for(j=0; j<b;j++){
                int index = (int) (Math.random() * array.length);
                int index1 = (int) (Math.random() * array[i].length);
                int temp = array[i][j];
                array[i][j] = array[index][index1];
                array[index][index1] = temp;
            }
        }
        
        System.out.println("Random Shuffling: ");
        for(i = 0; i < a; i++){
            for(j = 0; j <b; j++){
                System.out.printf("%d\t",array[i][j]);
                
            }
            System.out.print("\n");
        } 
    }
}