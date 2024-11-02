package lab3problem;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int[] time = new int[101];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integers between 1 to 100 (Enter 0 to Exit): ");

        int number;
        do {
            number = scanner.nextInt();
            if (number >= 1 && number <= 100) {
                time[number]++;
            }
        } while (number != 0);
        
         for (int i = 1; i <= 100; i++) {
            if (time[i] > 0) {
                System.out.printf("%d occurs %d times\n",i,time[i]);
            }
        }
    }
    
   
}
      


