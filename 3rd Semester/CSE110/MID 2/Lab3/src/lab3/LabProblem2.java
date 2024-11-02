package lab3;

import java.util.Scanner;

public class LabProblem2 {
    public static void main(String[] args) {
        int[] array = new int[101];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers between 1 to 100 (Enter 0 to Exit): ");

        int number;
        do {
            number = scanner.nextInt();
            if (number >= 1 && number <= 100) {
                array[number]++;
            }
        } while (number != 0);
        
         for (int i = 1; i <= 100; i++) {
            if (array[i] > 0) {
                System.out.printf("%d occurs %d times\n",i,array[i]);
            }
        }
    }
}
