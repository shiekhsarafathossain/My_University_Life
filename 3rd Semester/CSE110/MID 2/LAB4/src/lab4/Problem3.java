package lab4;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] emp;
        emp = new int[8][7];
        int[] total = new int[8];
        int[] employee = {0, 1, 2, 3, 4, 5, 6, 7};
        String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int row = 0; row < emp.length; row++) {
            int sum = 0;
            for (int col = 0; col < 7; col++) {
                System.out.printf("Employee %d's for %s : ", row, weeks[col]);
                emp[row][col] = input.nextInt();
                sum += emp[row][col];
            }
            total[row] = sum;
        }

        for (int row = 1; row < 8; row++) {
            for (int col = 0; col < 7; col++) {
                if (total[col] < total[col + 1]) {
                    int temp = total[col];
                    total[col] = total[col + 1];
                    total[col + 1] = temp;

                    int temp2 = employee[col];
                    employee[col] = employee[col + 1];
                    employee[col + 1] = temp2;
                }
            }
        }

        for (int col = 0; col < 8; col++) {
            System.out.printf("Employee %d's total hour of the week = %d", employee[col], total[col]);
            System.out.print("\n");
        }
    }
}
