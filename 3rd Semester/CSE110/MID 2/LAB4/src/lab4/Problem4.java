package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int num = input.nextInt();
        String[] array = new String[num];
        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the Words: ");
            array[i] = input.nextLine();
        }
        Arrays.sort(array);
        for (String x : array) {
            System.out.println(x);
        }
    }
}
