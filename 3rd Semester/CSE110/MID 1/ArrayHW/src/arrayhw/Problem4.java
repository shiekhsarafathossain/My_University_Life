package arrayhw;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        
        int[] arr;
        int i,n,sum=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        n = input.nextInt();
        
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0; i<n ; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        
        for (i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.printf("Sum of all elements : %d \n",sum);
    }
    
}
