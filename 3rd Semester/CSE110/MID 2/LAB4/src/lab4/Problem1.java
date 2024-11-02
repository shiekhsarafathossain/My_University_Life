package lab4;

import java.util.Random;

public class Problem1 {

    public static void main(String[] args) {

        int[][] array;

        array = new int[4][4];
        int count = 0;
        int count2 = 0;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                array[row][col] = (int) (Math.random() * 2);
            }
        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(array[row][col] + "");

            }
            System.out.print("\n");

        }

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

            }
            if (array[row][0] == 1) {
                count++;
            }
            if (array[0][row] == 1) {
                count2++;
            }
        }

        System.out.println("The largest row index: " + count2);
        System.out.println("The largest column index: " + count++);
    }

}
