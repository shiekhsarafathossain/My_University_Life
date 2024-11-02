package lab3problem;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        int[] array = new int[10];
        int[] check = new int[10];
        int j = 0;

        for (int row = 0; row < 10; row++) {
            int num = input.nextInt();
            array[row] = num;
            int multi = Isdistinct(array[row], check, j);
            if (multi == 0) {
                check[j] = array[row];
                j++;
            }
        }

        System.out.println("Unique inputs: ");
        for (int row = 0; row < j; row++) {
            if (check[row] != 0) {
                System.out.print(check[row] + " ");
            }
        }
        System.out.print("\n");
    }

    
    public static int Isdistinct(int num, int[] check, int j) {
        for (int k = 0; k < j; k++) {
            if (num == check[k]) {
                return 1;
            }
        }
        return 0;
    }
}
