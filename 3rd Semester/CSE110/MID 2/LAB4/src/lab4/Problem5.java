package lab4;

import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] Array = new int[4][4];
        int row, col, temp;
        System.out.println("Enter Array Element: ");
        for (row = 0; row < 4; row++) {
            for (col = 0; col < 4; col++) {
                Array[row][col] = input.nextInt();
            }
        }
        for (col = 0; col < 4; col++) {

            temp = Array[1][col];
            Array[1][col] = Array[3][col];
            Array[3][col] = temp;
        }

        System.out.println("Array After Swaping: ");
        for (row = 0; row < 4; row++) {
            for (col = 0; col < 4; col++) {
                System.out.print(Array[row][col] + " ");
            }
            System.out.println();
        }
    }

}
