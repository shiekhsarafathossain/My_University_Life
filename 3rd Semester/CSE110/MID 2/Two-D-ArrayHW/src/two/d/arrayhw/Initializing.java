package two.d.arrayhw;

import java.util.Scanner;

public class Initializing {
    public static void main(String[] args) {
        System.out.println("Enter the row and column number:");
        int a, b, i, j;

        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        b = x.nextInt();
        int[][] array;

        array = new int[a][b];
        int[] sum = new int[a];

        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                array[i][j] = x.nextInt();
            }
        }
        System.out.println("2D Array :  ");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(+array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        
        for (i = 0; i < a; i++) {
            sum[i] = 0;
            for (j = 0; j < b; j++) {
                sum[i] += array[i][j];
            }
            System.out.printf("The sum of the elements of row(%d) is %d \n", (i + 1), sum[i]);
        }
int c = 0,max = 0; 
        for (i = 0; i < a; i++) {
                if (sum[i] > max) {
                    max= sum[i];
                }
            }
        System.out.printf("The largest sum is in row (%d)",max);
        }
    
    
}
