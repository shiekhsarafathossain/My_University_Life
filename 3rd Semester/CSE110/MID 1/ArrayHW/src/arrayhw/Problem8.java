package arrayhw;

import java.util.Scanner;

public class Problem8 {
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
        for(i=1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length -1] = temp;
        
        System.out.println("Shifting element left: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
