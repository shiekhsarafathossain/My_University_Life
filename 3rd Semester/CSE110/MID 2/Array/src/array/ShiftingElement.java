package array;

import java.util.Scanner;

public class ShiftingElement {
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

        
        int temp = arr[0];
        for (i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        
        arr[n-1] = temp;
        
        System.out.println("Shifting array:");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        
    }
    
}
