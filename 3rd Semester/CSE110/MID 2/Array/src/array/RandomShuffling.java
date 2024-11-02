package array;

import java.util.Random;
import java.util.Scanner;

public class RandomShuffling {
    public static void main(String[] args) {
    int[] arr;
        int i, n;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements: ");
        n = input.nextInt();
        
        arr = new int[n];
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        
        Random rand = new Random();
        for (i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        System.out.println("Shuffled array:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
}
