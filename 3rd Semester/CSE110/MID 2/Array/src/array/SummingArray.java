package array;

import java.util.Scanner;

public class SummingArray {
    public static void main(String[] args) {
        
        int[] arr;
        int i,n,sum=0;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the number of element: ");
        n = input.nextInt();
            
        arr = new int[n];
        System.out.println("Enter the element: ");
        for(i=0 ; i<n ; i++){
            arr[i] = input.nextInt();
        }
            
        for (i=0; i<n ; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        
        System.out.printf("Sum of all elements : %d \n",sum);
    }
    
}
