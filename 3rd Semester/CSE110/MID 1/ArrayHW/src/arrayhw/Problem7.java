package arrayhw;

import java.util.Scanner;

public class Problem7 {
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

        int index = (int) (Math.random() * arr.length);
        int temp = arr[0];
        arr[0] = arr[index];
        arr[index] = temp;
        
        System.out.println("Random Shuffling: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
